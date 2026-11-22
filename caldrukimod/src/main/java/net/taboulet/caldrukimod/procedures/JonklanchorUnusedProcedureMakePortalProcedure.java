package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;
import net.taboulet.caldrukimod.init.CaldrukimodModMenus;
import net.taboulet.caldrukimod.init.CaldrukimodModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

public class JonklanchorUnusedProcedureMakePortalProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _entity0 && _entity0.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu0) && _menu0.getMenuState(1, "MakePortalAtDestination", false)) {
			world.setBlock(BlockPos.containing(
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu1 ? _menu1.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0)),
					CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0));
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("IsPortalAnchored", true);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0));
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("PortalAnchorX", entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0));
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("PortalAnchorY", entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0));
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("PortalAnchorZ", entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0));
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putString("PortalAnchorDimension", (entity.level().dimension() + ""));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0))))
					.getBlock() == CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL.get()) {
				world.setBlock(BlockPos.containing(
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0),
						(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0)),
						Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}