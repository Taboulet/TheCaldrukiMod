package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.HiWandLivingEntityIsHitWithItemProcedure;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class HiWandItem extends Item {
	public HiWandItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		HiWandLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}