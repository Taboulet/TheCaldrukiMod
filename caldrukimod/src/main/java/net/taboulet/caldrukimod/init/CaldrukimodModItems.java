/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.procedures.JonklanchorPropertyValueProviderProcedure;
import net.taboulet.caldrukimod.item.inventory.TheYapDrukiInventoryCapability;
import net.taboulet.caldrukimod.item.inventory.JonklanchorInventoryCapability;
import net.taboulet.caldrukimod.item.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

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
		CALDRUKIUM_ARMOR_HELMET = REGISTRY.register("caldrukium_armor_helmet", CaldrukiumArmorItem.Helmet::new);
		CALDRUKIUM_ARMOR_CHESTPLATE = REGISTRY.register("caldrukium_armor_chestplate", CaldrukiumArmorItem.Chestplate::new);
		CALDRUKIUM_ARMOR_LEGGINGS = REGISTRY.register("caldrukium_armor_leggings", CaldrukiumArmorItem.Leggings::new);
		CALDRUKIUM_ARMOR_BOOTS = REGISTRY.register("caldrukium_armor_boots", CaldrukiumArmorItem.Boots::new);
		JONKLERIUM = block(CaldrukimodModBlocks.JONKLERIUM);
		KEY = REGISTRY.register("key", KeyItem::new);
		DIRT_DRUKI = block(CaldrukimodModBlocks.DIRT_DRUKI);
		CALDRUKIA = REGISTRY.register("caldrukia", CaldrukiaItem::new);
		HAMSTER_DAM_ITEM = REGISTRY.register("hamster_dam_item", HamsterDamItemItem::new);
		HAMSTERDAM_SPAWN_EGG = REGISTRY.register("hamsterdam_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.HAMSTERDAM, -1, -1, new Item.Properties()));
		CALZOSKI_DOG_SPAWN_EGG = REGISTRY.register("calzoski_dog_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.CALZOSKI_DOG, -1, -1, new Item.Properties()));
		CALZOSKI_DOG_ITEM = REGISTRY.register("calzoski_dog_item", CalzoskiDogItemItem::new);
		ADRIAN = REGISTRY.register("adrian", AdrianItem::new);
		ENRIQUE = REGISTRY.register("enrique", EnriqueItem::new);
		ADRIAN_ORE = block(CaldrukimodModBlocks.ADRIAN_ORE);
		STONE_DRUKI = block(CaldrukimodModBlocks.STONE_DRUKI);
		ENRIQUE_ORE = block(CaldrukimodModBlocks.ENRIQUE_ORE);
		SOUND_BOARD = block(CaldrukimodModBlocks.SOUND_BOARD);
		FURRY_SUMMONER_BLOCK = block(CaldrukimodModBlocks.FURRY_SUMMONER_BLOCK);
		FURRY_BOSS_SPAWN_EGG = REGISTRY.register("furry_boss_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.FURRY_BOSS, -1, -1, new Item.Properties()));
		FURRY_WAND = REGISTRY.register("furry_wand", FurryWandItem::new);
		HI_WAND = REGISTRY.register("hi_wand", HiWandItem::new);
		GALAXY_NOTE_BOSS_SPAWN_EGG = REGISTRY.register("galaxy_note_boss_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.GALAXY_NOTE_BOSS, -1, -1, new Item.Properties()));
		GALAXY_NOTE_SUMMONER_BLOCK = block(CaldrukimodModBlocks.GALAXY_NOTE_SUMMONER_BLOCK);
		WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG = REGISTRY.register("weirdahhcryingfaceentity_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.WEIRDAHHCRYINGFACEENTITY, -1, -1, new Item.Properties()));
		WEIRD_AHH_CRYING_FACE_ITEM = REGISTRY.register("weird_ahh_crying_face_item", WeirdAhhCryingFaceItemItem::new);
		SO_NANA = REGISTRY.register("so_nana", SONanaItem::new);
		SO_NMELON = REGISTRY.register("so_nmelon", SONmelonItem::new);
		SO_NPPLE = REGISTRY.register("so_npple", SONppleItem::new);
		SO_NRANGE = REGISTRY.register("so_nrange", SONrangeItem::new);
		CALDRUKIUM = REGISTRY.register("caldrukium", CaldrukiumItem::new);
		CALDRUKI_BOSS_SPAWN_EGG = REGISTRY.register("caldruki_boss_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.CALDRUKI_BOSS, -1, -1, new Item.Properties()));
		CALDRUKI_SUMMONER_BLOCK = block(CaldrukimodModBlocks.CALDRUKI_SUMMONER_BLOCK);
		THE_FREAKLER = REGISTRY.register("the_freakler", TheFreaklerItem::new);
		CALDRUKISKO_ITEM = REGISTRY.register("caldrukisko_item", CaldrukiskoItemItem::new);
		MAP_DRUKI = REGISTRY.register("map_druki", MapDrukiItem::new);
		WHEAT_BREAD = REGISTRY.register("wheat_bread", WheatBreadItem::new);
		CAPT_SPAWN_EGG = REGISTRY.register("capt_spawn_egg", () -> new DeferredSpawnEggItem(CaldrukimodModEntities.CAPT, -52276, -1, new Item.Properties()));
		THE_YAP_DRUKI = REGISTRY.register("the_yap_druki", TheYapDrukiItem::new);
		JONKLANCHOR = REGISTRY.register("jonklanchor", JonklanchorItem::new);
		JONKL_ANCHOR_PORTAL = block(CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL);
		W_CRINE = REGISTRY.register("w_crine", WCrineItem::new);
		LIGHT_DRUKI = block(CaldrukimodModBlocks.LIGHT_DRUKI);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new TheYapDrukiInventoryCapability(stack), THE_YAP_DRUKI.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new JonklanchorInventoryCapability(stack), JONKLANCHOR.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(JONKLANCHOR.get(), ResourceLocation.parse("caldrukimod:jonklanchor_anchoredthingy"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) JonklanchorPropertyValueProviderProcedure.execute(itemStackToRender));
			});
		}
	}
}