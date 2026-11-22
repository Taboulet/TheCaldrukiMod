/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class CaldrukimodModTabs {
	public static ResourceKey<CreativeModeTab> TAB_THE_CALDRUKI_MOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, "the_caldruki_mod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_THE_CALDRUKI_MOD, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.caldrukimod.the_caldruki_mod"))
				.icon(() -> new ItemStack(CaldrukimodModItems.CALDRUKIUM_ARMOR_HELMET)).displayItems((parameters, tabData) -> {
					tabData.accept(CaldrukimodModItems.THE_YAP_DRUKI);
					tabData.accept(CaldrukimodModBlocks.JONKLERIUM.asItem());
					tabData.accept(CaldrukimodModItems.KEY);
					tabData.accept(CaldrukimodModItems.WHEAT_BREAD);
					tabData.accept(CaldrukimodModItems.CALDRUKIA);
					tabData.accept(CaldrukimodModBlocks.DIRT_DRUKI.asItem());
					tabData.accept(CaldrukimodModBlocks.STONE_DRUKI.asItem());
					tabData.accept(CaldrukimodModItems.MAP_DRUKI);
					tabData.accept(CaldrukimodModBlocks.ENRIQUE_ORE.asItem());
					tabData.accept(CaldrukimodModItems.ENRIQUE);
					tabData.accept(CaldrukimodModBlocks.ADRIAN_ORE.asItem());
					tabData.accept(CaldrukimodModItems.ADRIAN);
					tabData.accept(CaldrukimodModItems.HAMSTERDAM_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.HAMSTER_DAM_ITEM);
					tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_ITEM);
					tabData.accept(CaldrukimodModBlocks.SOUND_BOARD.asItem());
					tabData.accept(CaldrukimodModBlocks.FURRY_SUMMONER_BLOCK.asItem());
					tabData.accept(CaldrukimodModItems.CAPT_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.FURRY_BOSS_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.FURRY_WAND);
					tabData.accept(CaldrukimodModBlocks.GALAXY_NOTE_SUMMONER_BLOCK.asItem());
					tabData.accept(CaldrukimodModItems.GALAXY_NOTE_BOSS_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.HI_WAND);
					tabData.accept(CaldrukimodModItems.CALDRUKI_BOSS_SPAWN_EGG);
					tabData.accept(CaldrukimodModBlocks.CALDRUKI_SUMMONER_BLOCK.asItem());
					tabData.accept(CaldrukimodModItems.CALDRUKIUM);
					tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_HELMET);
					tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_CHESTPLATE);
					tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_LEGGINGS);
					tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_BOOTS);
					tabData.accept(CaldrukimodModItems.THE_FREAKLER);
					tabData.accept(CaldrukimodModItems.JONKLANCHOR);
					tabData.accept(CaldrukimodModItems.WEIRD_AHH_CRYING_FACE_ITEM);
					tabData.accept(CaldrukimodModItems.SO_NANA);
					tabData.accept(CaldrukimodModItems.SO_NMELON);
					tabData.accept(CaldrukimodModItems.SO_NPPLE);
					tabData.accept(CaldrukimodModItems.SO_NRANGE);
					tabData.accept(CaldrukimodModItems.WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG);
					tabData.accept(CaldrukimodModItems.CALDRUKISKO_ITEM);
					tabData.accept(CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL.asItem());
					tabData.accept(CaldrukimodModItems.W_CRINE);
					tabData.accept(CaldrukimodModBlocks.LIGHT_DRUKI.asItem());
				}).build());
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(CaldrukimodModItems.THE_FREAKLER);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SPAWN_EGGS).register(tabData -> {
			tabData.accept(CaldrukimodModItems.HAMSTERDAM_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.GALAXY_NOTE_BOSS_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.FURRY_BOSS_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.CAPT_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG);
			tabData.accept(CaldrukimodModItems.CALDRUKI_BOSS_SPAWN_EGG);
		});
	}
}