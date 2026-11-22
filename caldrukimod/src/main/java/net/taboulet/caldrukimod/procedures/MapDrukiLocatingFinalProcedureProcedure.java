package net.taboulet.caldrukimod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class MapDrukiLocatingFinalProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double LocationBiomeX = 0;
		double LocationBiomeY = 0;
		double LocationBiomeZ = 0;
		double ActionAmount = 0;
		double AttempsCurrentlyDoneBiome = 0;
		boolean IsBiomeFound = false;
		LocationBiomeX = 0;
		LocationBiomeY = 0;
		LocationBiomeZ = 0;
		ActionAmount = 0;
		IsBiomeFound = false;
		AttempsCurrentlyDoneBiome = 0;
		while (!IsBiomeFound && AttempsCurrentlyDoneBiome <= 1000) {
			ActionAmount = ActionAmount + 5;
			if (world.getBiome(BlockPos.containing(x + ActionAmount, y, z)).is(ResourceLocation.parse("caldrukimod:crine_biome")) == true) {
				LocationBiomeX = x + ActionAmount;
				LocationBiomeY = y;
				LocationBiomeZ = z;
				IsBiomeFound = true;
			}
			if (world.getBiome(BlockPos.containing(x - ActionAmount, y, z)).is(ResourceLocation.parse("caldrukimod:crine_biome")) == true) {
				LocationBiomeX = x - ActionAmount;
				LocationBiomeY = y;
				LocationBiomeZ = z;
				IsBiomeFound = true;
			}
			if (world.getBiome(BlockPos.containing(x, y, z - ActionAmount)).is(ResourceLocation.parse("caldrukimod:crine_biome")) == true) {
				LocationBiomeX = x;
				LocationBiomeY = y;
				LocationBiomeZ = z - ActionAmount;
				IsBiomeFound = true;
			}
			if (world.getBiome(BlockPos.containing(x, y, z + ActionAmount)).is(ResourceLocation.parse("caldrukimod:crine_biome")) == true) {
				LocationBiomeX = x;
				LocationBiomeY = y;
				LocationBiomeZ = z + ActionAmount;
				IsBiomeFound = true;
			}
			AttempsCurrentlyDoneBiome = AttempsCurrentlyDoneBiome + 1;
		}
		if (IsBiomeFound) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								("The nearest crine biome is at" + (LocationBiomeX + "" + (LocationBiomeY + "" + (LocationBiomeZ + "" + ("Which is " + (new Vec3(x, y, z)).distanceTo((new Vec3(LocationBiomeX, LocationBiomeY, LocationBiomeZ))))))))),
						false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("No crine biome was found"), false);
		}
	}
}