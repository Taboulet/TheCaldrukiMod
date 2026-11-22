/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class CaldrukimodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaldrukimodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_CALDRUKI_MOD = REGISTRY.register("the_caldruki_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.caldrukimod.the_caldruki_mod")).icon(() -> new ItemStack(CaldrukimodModItems.CALDRUKIUM_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CaldrukimodModItems.THE_YAP_DRUKI.get());
				tabData.accept(CaldrukimodModBlocks.JONKLERIUM.get().asItem());
				tabData.accept(CaldrukimodModItems.KEY.get());
				tabData.accept(CaldrukimodModItems.WHEAT_BREAD.get());
				tabData.accept(CaldrukimodModItems.CALDRUKIA.get());
				tabData.accept(CaldrukimodModBlocks.DIRT_DRUKI.get().asItem());
				tabData.accept(CaldrukimodModBlocks.STONE_DRUKI.get().asItem());
				tabData.accept(CaldrukimodModItems.MAP_DRUKI.get());
				tabData.accept(CaldrukimodModBlocks.ENRIQUE_ORE.get().asItem());
				tabData.accept(CaldrukimodModItems.ENRIQUE.get());
				tabData.accept(CaldrukimodModBlocks.ADRIAN_ORE.get().asItem());
				tabData.accept(CaldrukimodModItems.ADRIAN.get());
				tabData.accept(CaldrukimodModItems.HAMSTERDAM_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.HAMSTER_DAM_ITEM.get());
				tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_ITEM.get());
				tabData.accept(CaldrukimodModBlocks.SOUND_BOARD.get().asItem());
				tabData.accept(CaldrukimodModBlocks.FURRY_SUMMONER_BLOCK.get().asItem());
				tabData.accept(CaldrukimodModItems.CAPT_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.FURRY_BOSS_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.FURRY_WAND.get());
				tabData.accept(CaldrukimodModBlocks.GALAXY_NOTE_SUMMONER_BLOCK.get().asItem());
				tabData.accept(CaldrukimodModItems.GALAXY_NOTE_BOSS_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.HI_WAND.get());
				tabData.accept(CaldrukimodModItems.CALDRUKI_BOSS_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModBlocks.CALDRUKI_SUMMONER_BLOCK.get().asItem());
				tabData.accept(CaldrukimodModItems.CALDRUKIUM.get());
				tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_HELMET.get());
				tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_LEGGINGS.get());
				tabData.accept(CaldrukimodModItems.CALDRUKIUM_ARMOR_BOOTS.get());
				tabData.accept(CaldrukimodModItems.THE_FREAKLER.get());
				tabData.accept(CaldrukimodModItems.JONKLANCHOR.get());
				tabData.accept(CaldrukimodModItems.WEIRD_AHH_CRYING_FACE_ITEM.get());
				tabData.accept(CaldrukimodModItems.SO_NANA.get());
				tabData.accept(CaldrukimodModItems.SO_NMELON.get());
				tabData.accept(CaldrukimodModItems.SO_NPPLE.get());
				tabData.accept(CaldrukimodModItems.SO_NRANGE.get());
				tabData.accept(CaldrukimodModItems.WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG.get());
				tabData.accept(CaldrukimodModItems.CALDRUKISKO_ITEM.get());
				tabData.accept(CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL.get().asItem());
				tabData.accept(CaldrukimodModItems.W_CRINE.get());
				tabData.accept(CaldrukimodModBlocks.LIGHT_DRUKI.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CaldrukimodModItems.THE_FREAKLER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CaldrukimodModItems.HAMSTERDAM_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.CALZOSKI_DOG_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.GALAXY_NOTE_BOSS_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.FURRY_BOSS_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.CAPT_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.WEIRDAHHCRYINGFACEENTITY_SPAWN_EGG.get());
			tabData.accept(CaldrukimodModItems.CALDRUKI_BOSS_SPAWN_EGG.get());
		}
	}
}