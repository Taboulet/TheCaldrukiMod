/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.potion.HicurseMobEffect;
import net.taboulet.caldrukimod.potion.FurryEffectMobEffect;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class CaldrukimodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CaldrukimodMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> HICURSE = REGISTRY.register("hicurse", HicurseMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> FURRY_EFFECT = REGISTRY.register("furry_effect", FurryEffectMobEffect::new);
}