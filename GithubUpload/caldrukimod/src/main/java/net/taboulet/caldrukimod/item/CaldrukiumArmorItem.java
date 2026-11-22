package net.taboulet.caldrukimod.item;

import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;

@EventBusSubscriber
public abstract class CaldrukiumArmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 5);
				map.put(ArmorItem.Type.LEGGINGS, 8);
				map.put(ArmorItem.Type.CHESTPLATE, 10);
				map.put(ArmorItem.Type.HELMET, 5);
				map.put(ArmorItem.Type.BODY, 10);
			}), 9, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("caldrukimod:enrique-que")), () -> Ingredient.of(new ItemStack(CaldrukimodModItems.CALDRUKIUM.get())),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("caldrukimod:diamond"))), 6.7f, 0.2f);
			registerHelper.register(ResourceLocation.parse("caldrukimod:caldrukium_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public CaldrukiumArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends CaldrukiumArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC).durability(ArmorItem.Type.HELMET.getDurability(50)));
		}
	}

	public static class Chestplate extends CaldrukiumArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC).durability(ArmorItem.Type.CHESTPLATE.getDurability(50)));
		}
	}

	public static class Leggings extends CaldrukiumArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC).durability(ArmorItem.Type.LEGGINGS.getDurability(50)));
		}
	}

	public static class Boots extends CaldrukiumArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC).durability(ArmorItem.Type.BOOTS.getDurability(50)));
		}
	}
}