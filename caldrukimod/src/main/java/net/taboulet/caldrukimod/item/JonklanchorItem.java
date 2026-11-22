package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.world.inventory.JonklanchortestMenu;
import net.taboulet.caldrukimod.procedures.JonklanchorRightclickedProcedure;
import net.taboulet.caldrukimod.procedures.JonklanchorOpenBoundGUIOnRightClickProcedure;
import net.taboulet.caldrukimod.procedures.JonklanchorGlowProcedure;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;

import io.netty.buffer.Unpooled;

public class JonklanchorItem extends Item {
	public JonklanchorItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return JonklanchorGlowProcedure.execute(itemstack);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		if (entity instanceof ServerPlayer serverPlayer) {
			if (JonklanchorOpenBoundGUIOnRightClickProcedure.execute(serverPlayer, ar.getObject())) {
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
		JonklanchorRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}