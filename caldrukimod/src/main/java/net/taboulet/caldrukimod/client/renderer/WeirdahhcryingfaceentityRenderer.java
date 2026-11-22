package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.WeirdahhcryingfaceentityEntity;
import net.taboulet.caldrukimod.client.model.Modelweirdahhcryingface;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class WeirdahhcryingfaceentityRenderer extends MobRenderer<WeirdahhcryingfaceentityEntity, LivingEntityRenderState, Modelweirdahhcryingface> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/crine.png");

	public WeirdahhcryingfaceentityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweirdahhcryingface(context.bakeLayer(Modelweirdahhcryingface.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WeirdahhcryingfaceentityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}