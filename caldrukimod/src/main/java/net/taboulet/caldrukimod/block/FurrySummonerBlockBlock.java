package net.taboulet.caldrukimod.block;

import org.jetbrains.annotations.Nullable;

import net.taboulet.caldrukimod.procedures.FurrySummonerBlockRedstoneOnProcedure;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class FurrySummonerBlockBlock extends Block {
	public FurrySummonerBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			FurrySummonerBlockRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}