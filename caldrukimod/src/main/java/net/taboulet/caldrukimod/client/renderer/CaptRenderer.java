package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.CaptEntity;
import net.taboulet.caldrukimod.client.model.Modelcapt;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CaptRenderer extends MobRenderer<CaptEntity, Modelcapt<CaptEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/capt.png");

	public CaptRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapt<CaptEntity>(context.bakeLayer(Modelcapt.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaptEntity entity) {
		return entityTexture;
	}
}