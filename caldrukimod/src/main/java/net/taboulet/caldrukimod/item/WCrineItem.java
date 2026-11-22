package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.procedures.WcrineSpecialProcedure;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber
public class WCrineItem extends Item {
	public WCrineItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).alwaysEdible().build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(CaldrukimodModItems.W_CRINE.get(), (builder, _, _) -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStackTemplate(CaldrukimodModItems.W_CRINE.get()))));
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