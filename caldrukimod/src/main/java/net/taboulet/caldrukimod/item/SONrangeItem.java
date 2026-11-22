package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WeirdAhhCryingFaceSpecialItemPlayerFinishesUsingItemProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class SONrangeItem extends Item {
	public SONrangeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack usedItemstack = itemstack.copy();
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WeirdAhhCryingFaceSpecialItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}