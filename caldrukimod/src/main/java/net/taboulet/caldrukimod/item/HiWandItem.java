package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.HiWandLivingEntityIsHitWithItemProcedure;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class HiWandItem extends Item {
	public HiWandItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		HiWandLivingEntityIsHitWithItemProcedure.execute(entity);
	}
}