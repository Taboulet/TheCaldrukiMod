package net.taboulet.caldrukimod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MapDrukiRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:hamster_biome"))) {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Furry Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:furry_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Crine Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:crine_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:furry_biome"))) {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Hamster Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:hamster_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Crine Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:crine_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:crine_biome"))) {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Hamster Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:hamster_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal(("The Furry Biome is " + (executeCommandGetResult(world, new Vec3(x, y, z), "execute run locate biome caldrukimod:furry_biome")).replaceAll(".*\\((.*?)\\).*", "$1"))), false);
		}
		if (!(world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:hamster_biome")) || world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:furry_biome"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(Identifier.parse("caldrukimod:crine_biome")))) {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal("This map only work in Caldrukia"), false);
		}
	}

	private static String executeCommandGetResult(LevelAccessor world, Vec3 pos, String command) {
		StringBuilder result = new StringBuilder();
		if (world instanceof ServerLevel level) {
			CommandSource dataConsumer = new CommandSource() {
				@Override
				public void sendSystemMessage(Component message) {
					result.append(message.getString());
				}

				@Override
				public boolean acceptsSuccess() {
					return true;
				}

				@Override
				public boolean acceptsFailure() {
					return true;
				}

				@Override
				public boolean shouldInformAdmins() {
					return false;
				}
			};
			level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(dataConsumer, pos, Vec2.ZERO, level, LevelBasedPermissionSet.OWNER, Component.literal(""), level.getServer()), command);
		}
		return result.toString();
	}
}