package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.HamsterdamEntity;
import net.taboulet.caldrukimod.client.model.ModelHamsterdam;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class HamsterdamRenderer extends MobRenderer<HamsterdamEntity, LivingEntityRenderState, ModelHamsterdam> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/f0eafd186f0a4b6bff9b3eaf8d7d067a.png");

	public HamsterdamRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHamsterdam(context.bakeLayer(ModelHamsterdam.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HamsterdamEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}