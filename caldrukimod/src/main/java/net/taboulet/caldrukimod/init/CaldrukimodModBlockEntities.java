/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.block.entity.JonklAnchorPortalBlockEntity;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class CaldrukimodModBlockEntities {
	public static BlockEntityType<JonklAnchorPortalBlockEntity> JONKL_ANCHOR_PORTAL;

	public static void load() {
		JONKL_ANCHOR_PORTAL = register("jonkl_anchor_portal", CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL, JonklAnchorPortalBlockEntity::new);
	}

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> BlockEntityType<T> register(String registryname, Block block, FabricBlockEntityTypeBuilder.Factory<? extends T> supplier) {
		return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), FabricBlockEntityTypeBuilder.<T>create(supplier, block).build());
	}
}