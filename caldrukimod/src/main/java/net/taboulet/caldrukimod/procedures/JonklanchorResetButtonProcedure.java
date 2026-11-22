package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class JonklanchorResetButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CaldrukimodModItems.JONKLANCHOR) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal("JonklAnchor"));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CaldrukimodModItems.JONKLANCHOR) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal("JonklAnchor"));
		}
		if (entity instanceof Player _player)
			_player.containerMenu = _player.inventoryMenu;
	}
}