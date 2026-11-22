package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WcrineSpecialProcedure;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.component.DataComponents;

public class WCrineItem extends Item {
	public WCrineItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).alwaysEdible().build()).component(DataComponents.USE_REMAINDER,
				new UseRemainder(new ItemStackTemplate(CaldrukimodModItems.WEIRD_AHH_CRYING_FACE_ITEM))));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WcrineSpecialProcedure.execute(entity);
		return retval;
	}
}