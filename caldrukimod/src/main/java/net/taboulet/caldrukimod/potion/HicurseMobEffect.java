package net.taboulet.caldrukimod.potion;

import net.taboulet.caldrukimod.init.CaldrukimodModParticleTypes;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.SimpleParticleType;

public class HicurseMobEffect extends MobEffect {
	public HicurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -256, mobEffectInstance -> (SimpleParticleType) (CaldrukimodModParticleTypes.WARNING.get()));
	}
}