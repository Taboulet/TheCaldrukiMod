package net.taboulet.caldrukimod.network;

import net.taboulet.caldrukimod.procedures.YapDrukiPagePreviousProcedure;
import net.taboulet.caldrukimod.procedures.YapDrukiPageNextProcedure;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public record YapDrukiPage2ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<YapDrukiPage2ButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, "yap_druki_page_2_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, YapDrukiPage2ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, YapDrukiPage2ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new YapDrukiPage2ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<YapDrukiPage2ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final YapDrukiPage2ButtonMessage message, final ServerPlayNetworking.Context context) {
		context.server().execute(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z));
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			YapDrukiPageNextProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			YapDrukiPagePreviousProcedure.execute(world, x, y, z, entity);
		}
	}
}