/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.potion.HicurseMobEffect;
import net.taboulet.caldrukimod.potion.FurryEffectMobEffect;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.function.Supplier;

public class CaldrukimodModMobEffects {
	public static Holder<MobEffect> HICURSE;
	public static Holder<MobEffect> FURRY_EFFECT;

	public static void load() {
		HICURSE = register("hicurse", HicurseMobEffect::new);
		FURRY_EFFECT = register("furry_effect", FurryEffectMobEffect::new);
	}

	private static Holder<MobEffect> register(String registryname, Supplier<MobEffect> element) {
		return Holder.direct(Registry.register(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), element.get()));
	}
}