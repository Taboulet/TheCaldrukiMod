package net.taboulet.caldrukimod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class LightDrukiBlock extends Block {
	public LightDrukiBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15));
	}
}