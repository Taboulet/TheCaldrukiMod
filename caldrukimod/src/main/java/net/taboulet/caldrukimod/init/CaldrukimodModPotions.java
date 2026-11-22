/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class CaldrukimodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, CaldrukimodMod.MODID);
	public static final DeferredHolder<Potion, Potion> HICURSEPOTION = REGISTRY.register("hicursepotion", () -> new Potion("hicursepotion", new MobEffectInstance(CaldrukimodModMobEffects.HICURSE, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> FURRY_POTION = REGISTRY.register("furry_potion", () -> new Potion("furry_potion", new MobEffectInstance(CaldrukimodModMobEffects.FURRY_EFFECT, 3600, 0, false, true)));
}