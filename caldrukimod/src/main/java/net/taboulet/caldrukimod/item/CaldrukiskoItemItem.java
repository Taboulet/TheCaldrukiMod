package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.CaldrukiskoItemPlayerFinishesUsingItemProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class CaldrukiskoItemItem extends Item {
	public CaldrukiskoItemItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack usedItemstack = itemstack.copy();
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CaldrukiskoItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}