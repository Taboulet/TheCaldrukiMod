package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.init.CaldrukimodModMenus;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class SoundboardProcedureSYFMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof Player _entity0 && _entity0.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu0) && _menu0.getMenuState(1, "Autotune", false)) == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("caldrukimod:syfm-sb-a")), SoundSource.NEUTRAL, 1,
							(float) ((entity instanceof Player _entity1 && _entity1.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(2, "Pitch", 0.0) : 0.0));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("caldrukimod:syfm-sb-a")), SoundSource.NEUTRAL, 1,
							(float) ((entity instanceof Player _entity1 && _entity1.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(2, "Pitch", 0.0) : 0.0), false);
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("caldrukimod:syfm-sb")), SoundSource.NEUTRAL, 1,
							(float) ((entity instanceof Player _entity3 && _entity3.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(2, "Pitch", 0.0) : 0.0));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("caldrukimod:syfm-sb")), SoundSource.NEUTRAL, 1,
							(float) ((entity instanceof Player _entity3 && _entity3.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(2, "Pitch", 0.0) : 0.0), false);
				}
			}
		}
	}
}