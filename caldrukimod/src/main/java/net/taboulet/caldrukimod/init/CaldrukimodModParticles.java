/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.particle.WarningParticle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaldrukimodModParticles {
	public static void clientLoad() {
		ParticleProviderRegistry.getInstance().register(CaldrukimodModParticleTypes.WARNING, WarningParticle::provider);
	}
}