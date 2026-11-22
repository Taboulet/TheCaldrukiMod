package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.FurryBossEntity;
import net.taboulet.caldrukimod.client.model.Modeleviskintruly;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class FurryBossRenderer extends MobRenderer<FurryBossEntity, Modeleviskintruly<FurryBossEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("caldrukimod:textures/entities/eviskintrulytexture.png");

	public FurryBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleviskintruly<FurryBossEntity>(context.bakeLayer(Modeleviskintruly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FurryBossEntity entity) {
		return entityTexture;
	}
}