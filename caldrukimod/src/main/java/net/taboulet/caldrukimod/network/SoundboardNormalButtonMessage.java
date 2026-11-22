package net.taboulet.caldrukimod.network;

import net.taboulet.caldrukimod.procedures.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

@EventBusSubscriber
public record SoundboardNormalButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<SoundboardNormalButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, "soundboard_normal_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SoundboardNormalButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SoundboardNormalButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SoundboardNormalButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SoundboardNormalButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SoundboardNormalButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			SoundboardProcedureAdrianProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SoundboardProcedureEnriqueProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SoundboardProcedureAngleGrinderProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SoundboardProcedureFarProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			SoundboardProcedureAdrianaSalteProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SoundboardProcedureSYFMProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CaldrukimodMod.addNetworkMessage(SoundboardNormalButtonMessage.TYPE, SoundboardNormalButtonMessage.STREAM_CODEC, SoundboardNormalButtonMessage::handleData);
	}
}