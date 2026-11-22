package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.init.CaldrukimodModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HiCurseOverlayDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CaldrukimodModMobEffects.HICURSE);
	}
}