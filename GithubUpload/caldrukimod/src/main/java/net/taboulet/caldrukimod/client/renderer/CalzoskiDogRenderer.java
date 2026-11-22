package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.CalzoskiDogEntity;
import net.taboulet.caldrukimod.client.model.ModelNew;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CalzoskiDogRenderer extends MobRenderer<CalzoskiDogEntity, ModelNew<CalzoskiDogEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/calzoskidogfinal.png");

	public CalzoskiDogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNew<CalzoskiDogEntity>(context.bakeLayer(ModelNew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CalzoskiDogEntity entity) {
		return entityTexture;
	}
}