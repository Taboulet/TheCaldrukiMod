package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.world.inventory.JonklanchortestMenu;
import net.taboulet.caldrukimod.procedures.JonklanchorRightclickedProcedure;
import net.taboulet.caldrukimod.procedures.JonklanchorPropertyValueProviderProcedure;
import net.taboulet.caldrukimod.procedures.JonklanchorOpenBoundGUIOnRightClickProcedure;
import net.taboulet.caldrukimod.procedures.JonklanchorGlowProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

import com.mojang.serialization.MapCodec;

public class JonklanchorItem extends Item {
	public JonklanchorItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return JonklanchorGlowProcedure.execute(itemstack);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		if (entity instanceof ServerPlayer serverPlayer) {
			if (JonklanchorOpenBoundGUIOnRightClickProcedure.execute(serverPlayer, entity.getItemInHand(hand))) {
				serverPlayer.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("JonklAnchor");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
						packetBuffer.writeBlockPos(entity.blockPosition());
						packetBuffer.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
						return new JonklanchortestMenu(id, inventory, packetBuffer);
					}
				}, buf -> {
					buf.writeBlockPos(entity.blockPosition());
					buf.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
				});
			}
		}
		JonklanchorRightclickedProcedure.execute(entity, entity.getItemInHand(hand));
		return ar;
	}

	public record AnchoredthingyProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<AnchoredthingyProperty> MAP_CODEC = MapCodec.unit(new AnchoredthingyProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable ItemOwner owner, int seed) {
			return (float) JonklanchorPropertyValueProviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<AnchoredthingyProperty> type() {
			return MAP_CODEC;
		}
	}
}