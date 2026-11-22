package net.taboulet.caldrukimod.item.inventory;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage1Menu;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class TheYapDrukiInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == CaldrukimodModItems.THE_YAP_DRUKI.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof YapDrukiPage1Menu)
				player.closeContainer();
		}
	}

	public TheYapDrukiInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 9);
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != CaldrukimodModItems.THE_YAP_DRUKI.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}