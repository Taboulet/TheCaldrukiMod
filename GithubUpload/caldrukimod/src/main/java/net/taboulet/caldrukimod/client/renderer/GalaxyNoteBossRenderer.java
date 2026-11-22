package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.GalaxyNoteBossEntity;
import net.taboulet.caldrukimod.client.model.Modelgalaxynote;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GalaxyNoteBossRenderer extends MobRenderer<GalaxyNoteBossEntity, Modelgalaxynote<GalaxyNoteBossEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/galaxynote.png");

	public GalaxyNoteBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgalaxynote<GalaxyNoteBossEntity>(context.bakeLayer(Modelgalaxynote.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GalaxyNoteBossEntity entity) {
		return entityTexture;
	}
}