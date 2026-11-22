package net.taboulet.caldrukimod.potion;

import net.taboulet.caldrukimod.init.CaldrukimodModParticleTypes;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

public class HicurseMobEffect extends MobEffect {
	public HicurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (CaldrukimodModParticleTypes.WARNING.get());
	}
}