/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.item.inventory.TheYapDrukiInventoryCapability;
import net.taboulet.caldrukimod.item.inventory.JonklanchorInventoryCapability;
import net.taboulet.caldrukimod.item.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterRangeSelectItemModelPropertyEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.Identifier;

import java.util.function.Function;

@EventBusSubscriber
public class CaldrukimodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CaldrukimodMod.MODID);
	public static final DeferredItem<Item> CALDRUKIUM_ARMOR_HELMET;
	public static final DeferredItem<Item> CALDRUKIUM_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> CALDRUKIUM_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> CALDRUKIUM_ARMOR_BOOTS;
	public static final DeferredItem<Item> JONKLERIUM;
	public static final DeferredItem<Item> KEY;
	public static final DeferredItem<Item> DIRT_DRUKI;
	public static final DeferredItem<Item> CALDRUKIA;
	public static final DeferredItem<Item> HAMSTER_DAM_ITEM;
	public static final DeferredItem<Item> HAMSTERDAM_SPAWN_EGG;
	public static final DeferredItem<Item> CALZOSKI_DOG_SPAWN_EGG;
	public static final DeferredItem<Item> CALZOSKI_DOG_ITEM;
	public static final DeferredItem<Item> ADRIAN;
	public static final DeferredItem<Item> ENRIQUE;
	public static final DeferredItem<Item> ADRIAN_ORE;
	public static final DeferredItem<Item> STONE_DRUKI;
	public static final DeferredItem<Item> ENRIQUE_ORE;
	public static final DeferredItem<Item> SOUND_BOARD;
	public static final DeferredItem<Item> FURRY_SUMMONER_BLOCK;
	public static final DeferredItem<Item> FURRY_BOSS_SPAWN_EGG;
	public static final DeferredItem<Item> FURRY_WAND;
	public static final DeferredItem<Item> HI_WAND;
	public static final DeferredItem<Item> GALAXY_NOTE_BOSS_SPAWN_EGG;
	public static final DeferredItem<Item> GALAXY_NOTE_SUMMONER_BLOCK;
	public static final DeferredItem<Item> WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG;
	public static final DeferredItem<Item> WEIRD_AHH_CRYING_FACE_ITEM;
	public static final DeferredItem<Item> SO_NANA;
	public static final DeferredItem<Item> SO_NMELON;
	public static final DeferredItem<Item> SO_NPPLE;
	public static final DeferredItem<Item> SO_NRANGE;
	public static final DeferredItem<Item> CALDRUKIUM;
	public static final DeferredItem<Item> CALDRUKI_BOSS_SPAWN_EGG;
	public static final DeferredItem<Item> CALDRUKI_SUMMONER_BLOCK;
	public static final DeferredItem<Item> THE_FREAKLER;
	public static final DeferredItem<Item> CALDRUKISKO_ITEM;
	public static final DeferredItem<Item> MAP_DRUKI;
	public static final DeferredItem<Item> WHEAT_BREAD;
	public static final DeferredItem<Item> CAPT_SPAWN_EGG;
	public static final DeferredItem<Item> THE_YAP_DRUKI;
	public static final DeferredItem<Item> JONKLANCHOR;
	public static final DeferredItem<Item> JONKL_ANCHOR_PORTAL;
	public static final DeferredItem<Item> W_CRINE;
	public static final DeferredItem<Item> LIGHT_DRUKI;
	static {
		CALDRUKIUM_ARMOR_HELMET = register("caldrukium_armor_helmet", CaldrukiumArmorItem.Helmet::new);
		CALDRUKIUM_ARMOR_CHESTPLATE = register("caldrukium_armor_chestplate", CaldrukiumArmorItem.Chestplate::new);
		CALDRUKIUM_ARMOR_LEGGINGS = register("caldrukium_armor_leggings", CaldrukiumArmorItem.Leggings::new);
		CALDRUKIUM_ARMOR_BOOTS = register("caldrukium_armor_boots", CaldrukiumArmorItem.Boots::new);
		JONKLERIUM = block(CaldrukimodModBlocks.JONKLERIUM);
		KEY = register("key", KeyItem::new);
		DIRT_DRUKI = block(CaldrukimodModBlocks.DIRT_DRUKI);
		CALDRUKIA = register("caldrukia", CaldrukiaItem::new);
		HAMSTER_DAM_ITEM = register("hamster_dam_item", HamsterDamItemItem::new);
		HAMSTERDAM_SPAWN_EGG = register("hamsterdam_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.HAMSTERDAM.get())));
		CALZOSKI_DOG_SPAWN_EGG = register("calzoski_dog_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CALZOSKI_DOG.get())));
		CALZOSKI_DOG_ITEM = register("calzoski_dog_item", CalzoskiDogItemItem::new);
		ADRIAN = register("adrian", AdrianItem::new);
		ENRIQUE = register("enrique", EnriqueItem::new);
		ADRIAN_ORE = block(CaldrukimodModBlocks.ADRIAN_ORE);
		STONE_DRUKI = block(CaldrukimodModBlocks.STONE_DRUKI);
		ENRIQUE_ORE = block(CaldrukimodModBlocks.ENRIQUE_ORE);
		SOUND_BOARD = block(CaldrukimodModBlocks.SOUND_BOARD);
		FURRY_SUMMONER_BLOCK = block(CaldrukimodModBlocks.FURRY_SUMMONER_BLOCK);
		FURRY_BOSS_SPAWN_EGG = register("furry_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.FURRY_BOSS.get())));
		FURRY_WAND = register("furry_wand", FurryWandItem::new);
		HI_WAND = register("hi_wand", HiWandItem::new);
		GALAXY_NOTE_BOSS_SPAWN_EGG = register("galaxy_note_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.GALAXY_NOTE_BOSS.get())));
		GALAXY_NOTE_SUMMONER_BLOCK = block(CaldrukimodModBlocks.GALAXY_NOTE_SUMMONER_BLOCK);
		WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG = register("weirdahhcryingfaceentity_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.WEIRDAHHCRYINGFACEENTITY.get())));
		WEIRD_AHH_CRYING_FACE_ITEM = register("weird_ahh_crying_face_item", WeirdAhhCryingFaceItemItem::new);
		SO_NANA = register("so_nana", SONanaItem::new);
		SO_NMELON = register("so_nmelon", SONmelonItem::new);
		SO_NPPLE = register("so_npple", SONppleItem::new);
		SO_NRANGE = register("so_nrange", SONrangeItem::new);
		CALDRUKIUM = register("caldrukium", CaldrukiumItem::new);
		CALDRUKI_BOSS_SPAWN_EGG = register("caldruki_boss_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CALDRUKI_BOSS.get())));
		CALDRUKI_SUMMONER_BLOCK = block(CaldrukimodModBlocks.CALDRUKI_SUMMONER_BLOCK);
		THE_FREAKLER = register("the_freakler", TheFreaklerItem::new);
		CALDRUKISKO_ITEM = register("caldrukisko_item", CaldrukiskoItemItem::new);
		MAP_DRUKI = register("map_druki", MapDrukiItem::new);
		WHEAT_BREAD = register("wheat_bread", WheatBreadItem::new);
		CAPT_SPAWN_EGG = register("capt_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CaldrukimodModEntities.CAPT.get())));
		THE_YAP_DRUKI = register("the_yap_druki", TheYapDrukiItem::new);
		JONKLANCHOR = register("jonklanchor", JonklanchorItem::new);
		JONKL_ANCHOR_PORTAL = block(CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL);
		W_CRINE = register("w_crine", WCrineItem::new);
		LIGHT_DRUKI = block(CaldrukimodModBlocks.LIGHT_DRUKI);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.Item.ITEM, (stack, access) -> new TheYapDrukiInventoryCapability(access), THE_YAP_DRUKI.get());
		event.registerItem(Capabilities.Item.ITEM, (stack, access) -> new JonklanchorInventoryCapability(access), JONKLANCHOR.get());
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		public static void registerItemModelProperties(RegisterRangeSelectItemModelPropertyEvent event) {
			event.register(Identifier.parse("caldrukimod:jonklanchor/anchoredthingy"), JonklanchorItem.AnchoredthingyProperty.MAP_CODEC);
		}
	}
}