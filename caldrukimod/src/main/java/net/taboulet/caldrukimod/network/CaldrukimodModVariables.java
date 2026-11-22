package net.taboulet.caldrukimod.network;

import net.taboulet.caldrukimod.event.PlayerEvents;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.TagValueOutput;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.util.ProblemReporter;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityLevelChangeEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.Codec;

public class CaldrukimodModVariables {
	public static final AttachmentType<PlayerVariables> PLAYER_VARIABLES = AttachmentRegistry.create(Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, "player_variables"),
			(builder) -> builder.persistent(PlayerVariables.CODEC).initializer(PlayerVariables::new));

	public static void variablesLoad() {
		PayloadTypeRegistry.clientboundPlay().register(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC);
		ServerPlayerEvents.JOIN.register((player) -> {
			ServerPlayNetworking.send(player, new PlayerVariablesSyncMessage(player.getAttachedOrCreate(PLAYER_VARIABLES)));
		});
		ServerPlayerEvents.AFTER_RESPAWN.register((oldPlayer, newPlayer, alive) -> {
			ServerPlayNetworking.send(newPlayer, new PlayerVariablesSyncMessage(oldPlayer.getAttachedOrCreate(PLAYER_VARIABLES)));
		});
		ServerEntityLevelChangeEvents.AFTER_PLAYER_CHANGE_LEVEL.register((player, origin, destination) -> {
			if (!destination.isClientSide())
				ServerPlayNetworking.send(player, new PlayerVariablesSyncMessage(player.getAttachedOrCreate(PLAYER_VARIABLES)));
		});
		PlayerEvents.END_PLAYER_TICK.register((entity) -> {
			if (entity instanceof ServerPlayer player && player.getAttachedOrCreate(PLAYER_VARIABLES)._syncDirty) {
				ServerPlayNetworking.send(player, new PlayerVariablesSyncMessage(player.getAttachedOrCreate(PLAYER_VARIABLES)));
				player.getAttachedOrCreate(PLAYER_VARIABLES)._syncDirty = false;
			}
		});
		ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
			PlayerVariables original = oldPlayer.getAttachedOrCreate(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			if (alive) {
				clone.LastInteractedPortalX = original.LastInteractedPortalX;
				clone.LastInteractedPortalY = original.LastInteractedPortalY;
				clone.LastInteractedPortalZ = original.LastInteractedPortalZ;
				clone.LastChosenOption = original.LastChosenOption;
			}
			newPlayer.setAttached(PLAYER_VARIABLES, clone);
		});
	}

	public static class PlayerVariables {
		public static final Codec<PlayerVariables> CODEC = RecordCodecBuilder.create(builder -> builder
				.group(Codec.DOUBLE.fieldOf("LastInteractedPortalX").orElse(0d).forGetter((vars) -> vars.LastInteractedPortalX), Codec.DOUBLE.fieldOf("LastInteractedPortalY").orElse(0d).forGetter((vars) -> vars.LastInteractedPortalY),
						Codec.DOUBLE.fieldOf("LastInteractedPortalZ").orElse(0d).forGetter((vars) -> vars.LastInteractedPortalZ), Codec.DOUBLE.fieldOf("LastChosenOption").orElse(0d).forGetter((vars) -> vars.LastChosenOption))
				.apply(builder, PlayerVariables::new));
		boolean _syncDirty = false;
		public double LastInteractedPortalX = 0.0;
		public double LastInteractedPortalY = 0.0;
		public double LastInteractedPortalZ = 0.0;
		public double LastChosenOption = 0.0;

		public PlayerVariables() {
		}

		public PlayerVariables(double LastInteractedPortalX, double LastInteractedPortalY, double LastInteractedPortalZ, double LastChosenOption) {
			this.LastInteractedPortalX = LastInteractedPortalX;
			this.LastInteractedPortalY = LastInteractedPortalY;
			this.LastInteractedPortalZ = LastInteractedPortalZ;
			this.LastChosenOption = LastChosenOption;
		}

		public void serialize(ValueOutput output) {
			output.putDouble("LastInteractedPortalX", LastInteractedPortalX);
			output.putDouble("LastInteractedPortalY", LastInteractedPortalY);
			output.putDouble("LastInteractedPortalZ", LastInteractedPortalZ);
			output.putDouble("LastChosenOption", LastChosenOption);
		}

		public void deserialize(ValueInput input) {
			LastInteractedPortalX = input.getDoubleOr("LastInteractedPortalX", 0);
			LastInteractedPortalY = input.getDoubleOr("LastInteractedPortalY", 0);
			LastInteractedPortalZ = input.getDoubleOr("LastInteractedPortalZ", 0);
			LastChosenOption = input.getDoubleOr("LastChosenOption", 0);
		}

		public void markSyncDirty() {
			_syncDirty = true;
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> {
			TagValueOutput output = TagValueOutput.createWithContext(ProblemReporter.DISCARDING, buffer.registryAccess());
			message.data.serialize(output);
			buffer.writeNbt(output.buildResult());
		}, (RegistryFriendlyByteBuf buffer) -> {
			PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
			message.data.deserialize(TagValueInput.create(ProblemReporter.DISCARDING, buffer.registryAccess(), buffer.readNbt()));
			return message;
		});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final ClientPlayNetworking.Context context) {
			if (message.data != null) {
				context.client().execute(() -> {
					TagValueOutput output = TagValueOutput.createWithContext(ProblemReporter.DISCARDING, context.player().registryAccess());
					message.data.serialize(output);
					context.player().getAttachedOrCreate(PLAYER_VARIABLES).deserialize(TagValueInput.create(ProblemReporter.DISCARDING, context.player().registryAccess(), output.buildResult()));
				});
			}
		}
	}
}