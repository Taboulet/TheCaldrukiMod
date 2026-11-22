/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;

public class CaldrukimodModParticleTypes {
	public static final SimpleParticleType WARNING = FabricParticleTypes.simple();

	public static void load() {
		register("warning", WARNING);
	}

	private static void register(String registryname, SimpleParticleType element) {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), element);
	}
}