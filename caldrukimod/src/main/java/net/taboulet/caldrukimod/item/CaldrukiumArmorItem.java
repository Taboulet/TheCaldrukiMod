package net.taboulet.caldrukimod.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class CaldrukiumArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(50, Map.of(ArmorType.BOOTS, 5, ArmorType.LEGGINGS, 8, ArmorType.CHESTPLATE, 10, ArmorType.HELMET, 5, ArmorType.BODY, 10), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("caldrukimod:enrique-que")), 6.7f, 0.2f, TagKey.create(Registries.ITEM, Identifier.parse("caldrukimod:caldrukium_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("caldrukimod:caldrukium_armor")));

	private CaldrukiumArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends CaldrukiumArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends CaldrukiumArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends CaldrukiumArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends CaldrukiumArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}