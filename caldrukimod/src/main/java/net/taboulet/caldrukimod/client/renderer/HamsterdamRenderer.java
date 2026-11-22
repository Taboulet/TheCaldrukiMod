package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.HamsterdamEntity;
import net.taboulet.caldrukimod.client.model.ModelHamsterdam;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class HamsterdamRenderer extends MobRenderer<HamsterdamEntity, ModelHamsterdam<HamsterdamEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/f0eafd186f0a4b6bff9b3eaf8d7d067a.png");

	public HamsterdamRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHamsterdam<HamsterdamEntity>(context.bakeLayer(ModelHamsterdam.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HamsterdamEntity entity) {
		return entityTexture;
	}
}