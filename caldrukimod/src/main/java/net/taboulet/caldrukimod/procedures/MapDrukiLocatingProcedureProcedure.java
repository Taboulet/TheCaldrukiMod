package net.taboulet.caldrukimod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class MapDrukiLocatingProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		double LocationBiomeX = 0;
		double LocationBiomeY = 0;
		double LocationBiomeZ = 0;
		double ActionAmount = 0;
		boolean IsBiomeFound = false;
		LocationBiomeX = 0;
		LocationBiomeY = 0;
		LocationBiomeZ = 0;
		ActionAmount = 0;
		IsBiomeFound = false;
		if (((commandParameterEntity(arguments, "player")).getDirection()) == Direction.NORTH) {
			while (LocationBiomeX == 0) {
				for (int _i1 = 0; _i1 < (int) DoubleArgumentType.getDouble(arguments, "SearchAmount"); _i1++) {
					ActionAmount = ActionAmount + DoubleArgumentType.getDouble(arguments, "SearchDifference");
					if (world.getBiome(BlockPos.containing(x, y, z - ActionAmount)).is(Identifier.parse("caldrukimod:crine_biome")) == true) {
						LocationBiomeX = x;
						LocationBiomeY = y;
						LocationBiomeZ = z - ActionAmount;
					}
				}
			}
		} else if (((commandParameterEntity(arguments, "player")).getDirection()) == Direction.SOUTH) {
			while (LocationBiomeX == 0) {
				for (int _i1 = 0; _i1 < (int) DoubleArgumentType.getDouble(arguments, "SearchAmount"); _i1++) {
					ActionAmount = ActionAmount + DoubleArgumentType.getDouble(arguments, "SearchDifference");
					if (world.getBiome(BlockPos.containing(x, y, z + ActionAmount)).is(Identifier.parse("caldrukimod:crine_biome")) == true) {
						LocationBiomeX = x;
						LocationBiomeY = y;
						LocationBiomeZ = z + ActionAmount;
					}
				}
			}
		}
		if (((commandParameterEntity(arguments, "player")).getDirection()) == Direction.EAST) {
			while (LocationBiomeX == 0) {
				for (int _i1 = 0; _i1 < (int) DoubleArgumentType.getDouble(arguments, "SearchAmount"); _i1++) {
					ActionAmount = ActionAmount + DoubleArgumentType.getDouble(arguments, "SearchDifference");
					if (world.getBiome(BlockPos.containing(x + ActionAmount, y, z)).is(Identifier.parse("caldrukimod:crine_biome")) == true) {
						LocationBiomeX = x + ActionAmount;
						LocationBiomeY = y;
						LocationBiomeZ = z;
					}
				}
			}
		} else if (((commandParameterEntity(arguments, "player")).getDirection()) == Direction.WEST) {
			while (LocationBiomeX == 0) {
				for (int _i1 = 0; _i1 < (int) DoubleArgumentType.getDouble(arguments, "SearchAmount"); _i1++) {
					ActionAmount = ActionAmount + DoubleArgumentType.getDouble(arguments, "SearchDifference");
					if (world.getBiome(BlockPos.containing(x - ActionAmount, y, z)).is(Identifier.parse("caldrukimod:furry_biome")) == true) {
						LocationBiomeX = x - ActionAmount;
						LocationBiomeY = y;
						LocationBiomeZ = z;
					}
				}
			}
		}
		if (LocationBiomeX == 0) {
			if ((commandParameterEntity(arguments, "player")) instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal("No furry biome was found"), false);
		} else {
			if ((commandParameterEntity(arguments, "player")) instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The nearest furry biome is at" + (LocationBiomeX + "" + (LocationBiomeY + "" + LocationBiomeZ)))), false);
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSourceStack> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}