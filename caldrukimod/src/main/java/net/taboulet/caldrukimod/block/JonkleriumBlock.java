package net.taboulet.caldrukimod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class JonkleriumBlock extends Block {
	public JonkleriumBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}