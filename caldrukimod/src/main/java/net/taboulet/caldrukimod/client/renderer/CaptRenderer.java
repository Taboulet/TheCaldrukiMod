package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.CaptEntity;
import net.taboulet.caldrukimod.client.model.Modelcapt;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaptRenderer extends MobRenderer<CaptEntity, LivingEntityRenderState, Modelcapt> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/capt.png");

	public CaptRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapt(context.bakeLayer(Modelcapt.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CaptEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}