package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WcrineSpecialProcedure;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

public class WCrineItem extends Item {
	public WCrineItem() {
		super(new Item.Properties().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).alwaysEdible().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack usedItemstack = itemstack.copy();
		ItemStack retval = new ItemStack(CaldrukimodModItems.W_CRINE.get());
		super.finishUsingItem(itemstack, world, entity);
		WcrineSpecialProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}