package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.CaldrukiBossEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class CaldrukiBossRenderer extends HumanoidMobRenderer<CaldrukiBossEntity, HumanoidModel<CaldrukiBossEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/caldo.png");

	public CaldrukiBossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<CaldrukiBossEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(CaldrukiBossEntity entity) {
		return entityTexture;
	}
}