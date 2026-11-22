package net.taboulet.caldrukimod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class HicurseOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double hipitchbuttruly = 0;
		hipitchbuttruly = Mth.nextDouble(RandomSource.create(), 1, 5);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("caldrukimod:enrique-que")), SoundSource.NEUTRAL, 1, (float) hipitchbuttruly);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("caldrukimod:enrique-que")), SoundSource.NEUTRAL, 1, (float) hipitchbuttruly, false);
			}
		}
	}
}