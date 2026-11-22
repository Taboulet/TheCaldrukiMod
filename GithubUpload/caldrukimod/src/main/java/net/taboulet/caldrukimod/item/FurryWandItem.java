package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.FurryWandLivingEntityIsHitWithItemProcedure;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class FurryWandItem extends Item {
	public FurryWandItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FurryWandLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}