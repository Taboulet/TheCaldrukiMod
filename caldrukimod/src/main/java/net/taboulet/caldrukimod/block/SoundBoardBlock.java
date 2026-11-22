package net.taboulet.caldrukimod.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class SoundBoardBlock extends Block {
	public SoundBoardBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(3f, 5f));
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player)
			player.openMenu(world.getBlockEntity(pos) instanceof MenuProvider menuProvider ? menuProvider : null);
		return InteractionResult.SUCCESS;
	}
}