package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WeirdAhhCryingFaceItemPlayerFinishesUsingItemProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class WeirdAhhCryingFaceItemItem extends Item {
	public WeirdAhhCryingFaceItemItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WeirdAhhCryingFaceItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}