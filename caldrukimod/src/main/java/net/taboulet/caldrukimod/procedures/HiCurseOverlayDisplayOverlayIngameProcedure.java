package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.init.CaldrukimodModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HiCurseOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean HiCurseAndStuff = false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CaldrukimodModMobEffects.HICURSE)) {
			HiCurseAndStuff = true;
		}
		return HiCurseAndStuff;
	}
}