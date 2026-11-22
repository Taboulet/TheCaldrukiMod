/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

public class CaldrukimodModPotions {
	public static Holder<Potion> HICURSEPOTION;
	public static Holder<Potion> FURRY_POTION;

	public static void load() {
		HICURSEPOTION = register("hicursepotion", new Potion("hicursepotion", new MobEffectInstance(CaldrukimodModMobEffects.HICURSE, 3600, 0, false, true)));
		FURRY_POTION = register("furry_potion", new Potion("furry_potion", new MobEffectInstance(CaldrukimodModMobEffects.FURRY_EFFECT, 3600, 0, false, true)));
	}

	private static Holder<Potion> register(String registryname, Potion element) {
		return Holder.direct(Registry.register(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), element));
	}
}