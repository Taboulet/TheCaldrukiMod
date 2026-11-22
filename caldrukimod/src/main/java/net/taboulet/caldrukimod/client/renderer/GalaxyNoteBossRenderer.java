package net.taboulet.caldrukimod.client.renderer;

import net.taboulet.caldrukimod.entity.GalaxyNoteBossEntity;
import net.taboulet.caldrukimod.client.model.Modelgalaxynote;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GalaxyNoteBossRenderer extends MobRenderer<GalaxyNoteBossEntity, LivingEntityRenderState, Modelgalaxynote> {
	private final Identifier entityTexture = Identifier.parse("caldrukimod:textures/entities/galaxynote.png");

	public GalaxyNoteBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgalaxynote(context.bakeLayer(Modelgalaxynote.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GalaxyNoteBossEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}