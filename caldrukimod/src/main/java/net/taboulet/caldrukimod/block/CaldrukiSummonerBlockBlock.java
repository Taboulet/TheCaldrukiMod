package net.taboulet.caldrukimod.block;

import org.jetbrains.annotations.Nullable;

import net.taboulet.caldrukimod.procedures.CaldrukiSummonerBlockRedstoneOnProcedure;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class CaldrukiSummonerBlockBlock extends Block {
	public CaldrukiSummonerBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			CaldrukiSummonerBlockRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}