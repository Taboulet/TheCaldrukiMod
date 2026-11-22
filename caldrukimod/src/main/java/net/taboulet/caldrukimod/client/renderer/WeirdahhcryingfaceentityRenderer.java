package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.WeirdahhcryingfaceentityEntity;
import net.taboulet.caldrukimod.client.model.Modelweirdahhcryingface;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WeirdahhcryingfaceentityRenderer extends MobRenderer<WeirdahhcryingfaceentityEntity, Modelweirdahhcryingface<WeirdahhcryingfaceentityEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/crine.png");

	public WeirdahhcryingfaceentityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweirdahhcryingface<WeirdahhcryingfaceentityEntity>(context.bakeLayer(Modelweirdahhcryingface.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeirdahhcryingfaceentityEntity entity) {
		return entityTexture;
	}
}