/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.item.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import java.util.function.Function;

public class CaldrukimodModItems {
	public static Item CALDRUKIUM_ARMOR_HELMET;
	public static Item CALDRUKIUM_ARMOR_CHESTPLATE;
	public static Item CALDRUKIUM_ARMOR_LEGGINGS;
	public static Item CALDRUKIUM_ARMOR_BOOTS;
	public static Item JONKLERIUM;
	public static Item KEY;
	public static Item DIRT_DRUKI;
	public static Item CALDRUKIA;
	public static Item HAMSTER_DAM_ITEM;
	public static Item HAMSTERDAM_SPAWN_EGG;
	public static Item CALZOSKI_DOG_SPAWN_EGG;
	public static Item CALZOSKI_DOG_ITEM;
	public static Item ADRIAN;
	public static Item ENRIQUE;
	public static Item ADRIAN_ORE;
	public static Item STONE_DRUKI;
	public static Item ENRIQUE_ORE;
	public static Item SOUND_BOARD;
	public static Item FURRY_SUMMONER_BLOCK;
	public static Item FURRY_BOSS_SPAWN_EGG;
	public static Item FURRY_WAND;
	public static Item HI_WAND;
	public static Item GALAXY_NOTE_BOSS_SPAWN_EGG;
	public static Item GALAXY_NOTE_SUMMONER_BLOCK;
	public static Item WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG;
	public static Item WEIRD_AHH_CRYING_FACE_ITEM;
	public static Item SO_NANA;
	public static Item SO_NMELON;
	public static Item SO_NPPLE;
	public static Item SO_NRANGE;
	public static Item CALDRUKIUM;
	public static Item CALDRUKI_BOSS_SPAWN_EGG;
	public static Item CALDRUKI_SUMMONER_BLOCK;
	public static Item THE_FREAKLER;
	public static Item CALDRUKISKO_ITEM;
	public static Item MAP_DRUKI;
	public static Item WHEAT_BREAD;
	public static Item CAPT_SPAWN_EGG;
	public static Item THE_YAP_DRUKI;
	public static Item JONKLANCHOR;
	public static Item JONKL_ANCHOR_PORTAL;
	public static Item W_CRINE;
	public static Item LIGHT_DRUKI;

	public static void load() {
		CALDRUKIUM_ARMOR_HELMET = register("caldrukium_armor_helmet", CaldrukiumArmorItem.Helmet::new);
		CALDRUKIUM_ARMOR_CHESTPLATE = register("caldrukium_armor_chestplate", CaldrukiumArmorItem.Chestplate::new);
		CALDRUKIUM_ARMOR_LEGGINGS = register("caldrukium_armor_leggings", CaldrukiumArmorItem.Leggings::new);
		CALDRUKIUM_ARMOR_BOOTS = register("caldrukium_armor_boots", CaldrukiumArmorItem.Boots::new);
		JONKLERIUM = block(CaldrukimodModBlocks.JONKLERIUM, "jonklerium");
		KEY = register("key", KeyItem::new);
		DIRT_DRUKI = block(CaldrukimodModBlocks.DIRT_DRUKI, "dirt_druki");
		CALDRUKIA = register("caldrukia", CaldrukiaItem::new);
		HAMSTER_DAM_ITEM = register("hamster_dam_item", HamsterDamItemItem::new);
		HAMSTERDAM_SPAWN_EGG = register("hamsterdam_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.HAMSTERDAM)));
		CALZOSKI_DOG_SPAWN_EGG = register("calzoski_dog_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CALZOSKI_DOG)));
		CALZOSKI_DOG_ITEM = register("calzoski_dog_item", CalzoskiDogItemItem::new);
		ADRIAN = register("adrian", AdrianItem::new);
		ENRIQUE = register("enrique", EnriqueItem::new);
		ADRIAN_ORE = block(CaldrukimodModBlocks.ADRIAN_ORE, "adrian_ore");
		STONE_DRUKI = block(CaldrukimodModBlocks.STONE_DRUKI, "stone_druki");
		ENRIQUE_ORE = block(CaldrukimodModBlocks.ENRIQUE_ORE, "enrique_ore");
		SOUND_BOARD = block(CaldrukimodModBlocks.SOUND_BOARD, "sound_board");
		FURRY_SUMMONER_BLOCK = block(CaldrukimodModBlocks.FURRY_SUMMONER_BLOCK, "furry_summoner_block");
		FURRY_BOSS_SPAWN_EGG = register("furry_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.FURRY_BOSS)));
		FURRY_WAND = register("furry_wand", FurryWandItem::new);
		HI_WAND = register("hi_wand", HiWandItem::new);
		GALAXY_NOTE_BOSS_SPAWN_EGG = register("galaxy_note_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.GALAXY_NOTE_BOSS)));
		GALAXY_NOTE_SUMMONER_BLOCK = block(CaldrukimodModBlocks.GALAXY_NOTE_SUMMONER_BLOCK, "galaxy_note_summoner_block");
		WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG = register("weirdahhcryingfaceentity_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.WEIRDAHHCRYINGFACEENTITY)));
		WEIRD_AHH_CRYING_FACE_ITEM = register("weird_ahh_crying_face_item", WeirdAhhCryingFaceItemItem::new);
		SO_NANA = register("so_nana", SONanaItem::new);
		SO_NMELON = register("so_nmelon", SONmelonItem::new);
		SO_NPPLE = register("so_npple", SONppleItem::new);
		SO_NRANGE = register("so_nrange", SONrangeItem::new);
		CALDRUKIUM = register("caldrukium", CaldrukiumItem::new);
		CALDRUKI_BOSS_SPAWN_EGG = register("caldruki_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CALDRUKI_BOSS)));
		CALDRUKI_SUMMONER_BLOCK = block(CaldrukimodModBlocks.CALDRUKI_SUMMONER_BLOCK, "caldruki_summoner_block");
		THE_FREAKLER = register("the_freakler", TheFreaklerItem::new);
		CALDRUKISKO_ITEM = register("caldrukisko_item", CaldrukiskoItemItem::new);
		MAP_DRUKI = register("map_druki", MapDrukiItem::new);
		WHEAT_BREAD = register("wheat_bread", WheatBreadItem::new);
		CAPT_SPAWN_EGG = register("capt_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CAPT)));
		THE_YAP_DRUKI = register("the_yap_druki", TheYapDrukiItem::new);
		JONKLANCHOR = register("jonklanchor", JonklanchorItem::new);
		JONKL_ANCHOR_PORTAL = block(CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL, "jonkl_anchor_portal");
		W_CRINE = register("w_crine", WCrineItem::new);
		LIGHT_DRUKI = block(CaldrukimodModBlocks.LIGHT_DRUKI, "light_druki");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, name)), (Function<Item.Properties, Item>) supplier, new Item.Properties());
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}

	private static Item registerItem(final ResourceKey<Item> id, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
		Item item = (Item) itemFactory.apply(properties.setId(id));
		if (item instanceof BlockItem blockItem) {
			blockItem.registerBlocks(Item.BY_BLOCK, item);
		}
		return (Item) Registry.register(BuiltInRegistries.ITEM, id, item);
	}
}