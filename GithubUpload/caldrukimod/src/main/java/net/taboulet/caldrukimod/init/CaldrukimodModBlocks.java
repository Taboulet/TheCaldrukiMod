/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.block.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class CaldrukimodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CaldrukimodMod.MODID);
	public static final DeferredBlock<Block> JONKLERIUM;
	public static final DeferredBlock<Block> DIRT_DRUKI;
	public static final DeferredBlock<Block> CALDRUKIA_PORTAL;
	public static final DeferredBlock<Block> ADRIAN_ORE;
	public static final DeferredBlock<Block> STONE_DRUKI;
	public static final DeferredBlock<Block> ENRIQUE_ORE;
	public static final DeferredBlock<Block> SOUND_BOARD;
	public static final DeferredBlock<Block> FURRY_SUMMONER_BLOCK;
	public static final DeferredBlock<Block> GALAXY_NOTE_SUMMONER_BLOCK;
	public static final DeferredBlock<Block> CALDRUKI_SUMMONER_BLOCK;
	public static final DeferredBlock<Block> JONKL_ANCHOR_PORTAL;
	public static final DeferredBlock<Block> LIGHT_DRUKI;
	static {
		JONKLERIUM = REGISTRY.register("jonklerium", JonkleriumBlock::new);
		DIRT_DRUKI = REGISTRY.register("dirt_druki", DirtDrukiBlock::new);
		CALDRUKIA_PORTAL = REGISTRY.register("caldrukia_portal", CaldrukiaPortalBlock::new);
		ADRIAN_ORE = REGISTRY.register("adrian_ore", AdrianOreBlock::new);
		STONE_DRUKI = REGISTRY.register("stone_druki", StoneDrukiBlock::new);
		ENRIQUE_ORE = REGISTRY.register("enrique_ore", EnriqueOreBlock::new);
		SOUND_BOARD = REGISTRY.register("sound_board", SoundBoardBlock::new);
		FURRY_SUMMONER_BLOCK = REGISTRY.register("furry_summoner_block", FurrySummonerBlockBlock::new);
		GALAXY_NOTE_SUMMONER_BLOCK = REGISTRY.register("galaxy_note_summoner_block", GalaxyNoteSummonerBlockBlock::new);
		CALDRUKI_SUMMONER_BLOCK = REGISTRY.register("caldruki_summoner_block", CaldrukiSummonerBlockBlock::new);
		JONKL_ANCHOR_PORTAL = REGISTRY.register("jonkl_anchor_portal", JonklAnchorPortalBlock::new);
		LIGHT_DRUKI = REGISTRY.register("light_druki", LightDrukiBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}