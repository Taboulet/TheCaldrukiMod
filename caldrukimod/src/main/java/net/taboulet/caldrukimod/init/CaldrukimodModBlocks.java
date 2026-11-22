/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.block.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

public class CaldrukimodModBlocks {
	public static Block JONKLERIUM;
	public static Block DIRT_DRUKI;
	public static Block CALDRUKIA_PORTAL;
	public static Block ADRIAN_ORE;
	public static Block STONE_DRUKI;
	public static Block ENRIQUE_ORE;
	public static Block SOUND_BOARD;
	public static Block FURRY_SUMMONER_BLOCK;
	public static Block GALAXY_NOTE_SUMMONER_BLOCK;
	public static Block CALDRUKI_SUMMONER_BLOCK;
	public static Block JONKL_ANCHOR_PORTAL;
	public static Block LIGHT_DRUKI;

	public static void load() {
		JONKLERIUM = register("jonklerium", JonkleriumBlock::new);
		DIRT_DRUKI = register("dirt_druki", DirtDrukiBlock::new);
		CALDRUKIA_PORTAL = register("caldrukia_portal", CaldrukiaPortalBlock::new);
		ADRIAN_ORE = register("adrian_ore", AdrianOreBlock::new);
		STONE_DRUKI = register("stone_druki", StoneDrukiBlock::new);
		ENRIQUE_ORE = register("enrique_ore", EnriqueOreBlock::new);
		SOUND_BOARD = register("sound_board", SoundBoardBlock::new);
		FURRY_SUMMONER_BLOCK = register("furry_summoner_block", FurrySummonerBlockBlock::new);
		GALAXY_NOTE_SUMMONER_BLOCK = register("galaxy_note_summoner_block", GalaxyNoteSummonerBlockBlock::new);
		CALDRUKI_SUMMONER_BLOCK = register("caldruki_summoner_block", CaldrukiSummonerBlockBlock::new);
		JONKL_ANCHOR_PORTAL = register("jonkl_anchor_portal", JonklAnchorPortalBlock::new);
		LIGHT_DRUKI = register("light_druki", LightDrukiBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}