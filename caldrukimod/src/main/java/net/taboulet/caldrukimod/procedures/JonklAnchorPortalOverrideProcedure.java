package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;
import net.taboulet.caldrukimod.init.CaldrukimodModMenus;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;
import net.taboulet.caldrukimod.init.CaldrukimodModBlocks;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

public class JonklAnchorPortalOverrideProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY)
				.copyTag().getBooleanOr("IsAnchored", false) == true) {
			if ((world.getBlockState(BlockPos.containing(entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX, entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY,
					entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ))).getBlock() == CaldrukimodModBlocks.JONKL_ANCHOR_PORTAL.get()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX, entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY,
							entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("IsPortalAnchored", true);
						_blockEntity.getPersistentData().putDouble("PortalAnchorX",
								((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY)
										.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorX", 0)));
						_blockEntity.getPersistentData().putDouble("PortalAnchorY",
								((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY)
										.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorY", 0)));
						_blockEntity.getPersistentData().putDouble("PortalAnchorZ",
								((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY)
										.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorZ", 0)));
						_blockEntity.getPersistentData().putString("PortalAnchorDimension",
								((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(0).getItem() : ItemStack.EMPTY)
										.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getStringOr("AnchorDimension", "")));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					int _value = (int) ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(0).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("AnchorTexture", 0));
					BlockPos _pos = BlockPos.containing(entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX, entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY,
							entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("jonklanchorcolor") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("\u00A7cAn error occured, please try again"), false);
			}
		} else {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == CaldrukimodModItems.JONKLANCHOR.get()) {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("\u00A7cThe JonklAnchor must have a set position"), false);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX, entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY,
						entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("IsPortalAnchored", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalX, entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalY,
						entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastInteractedPortalZ);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("jonklanchorcolor") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}