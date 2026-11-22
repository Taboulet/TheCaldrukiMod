package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.CalzoskiDogEntity;
import net.taboulet.caldrukimod.client.model.ModelNew;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CalzoskiDogRenderer extends MobRenderer<CalzoskiDogEntity, LivingEntityRenderState, ModelNew> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/calzoskidogfinal.png");

	public CalzoskiDogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNew(context.bakeLayer(ModelNew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CalzoskiDogEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}