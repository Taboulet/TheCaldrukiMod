package net.taboulet.caldrukimod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.ParticleTypes;

public class FurryEffectMobEffect extends MobEffect {
	public FurryEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1, ParticleTypes.CLOUD);
	}
}