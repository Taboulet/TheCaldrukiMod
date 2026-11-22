package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.FurryBossEntity;
import net.taboulet.caldrukimod.client.model.Modeleviskintruly;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class FurryBossRenderer extends MobRenderer<FurryBossEntity, LivingEntityRenderState, Modeleviskintruly> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/eviskintrulytexture.png");

	public FurryBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleviskintruly(context.bakeLayer(Modeleviskintruly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FurryBossEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}