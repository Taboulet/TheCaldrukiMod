package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;

import net.minecraft.world.entity.Entity;

public class JonklanchorButtonSet2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CaldrukimodModVariables.PlayerVariables _vars = entity.getAttachedOrCreate(CaldrukimodModVariables.PLAYER_VARIABLES);
			_vars.LastChosenOption = 3;
			_vars.markSyncDirty();
		}
	}
}