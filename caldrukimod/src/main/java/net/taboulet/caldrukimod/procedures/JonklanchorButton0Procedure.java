package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;

import net.minecraft.world.entity.Entity;

public class JonklanchorButton0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity.getAttachedOrCreate(CaldrukimodModVariables.PLAYER_VARIABLES).LastChosenOption == 1);
	}
}