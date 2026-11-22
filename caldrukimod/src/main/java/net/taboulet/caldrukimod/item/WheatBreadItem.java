package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WheatBreadPlayerFinishesUsingItemProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class WheatBreadItem extends Item {
	public WheatBreadItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(-1).saturationModifier(-1f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WheatBreadPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}