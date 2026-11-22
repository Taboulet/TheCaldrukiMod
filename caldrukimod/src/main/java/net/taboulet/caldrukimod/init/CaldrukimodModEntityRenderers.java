/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.renderer.*;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class CaldrukimodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CaldrukimodModEntities.HAMSTERDAM.get(), HamsterdamRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.CALZOSKI_DOG.get(), CalzoskiDogRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.FURRY_BOSS.get(), FurryBossRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.GALAXY_NOTE_BOSS.get(), GalaxyNoteBossRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.WEIRDAHHCRYINGFACEENTITY.get(), WeirdahhcryingfaceentityRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.CALDRUKI_BOSS.get(), CaldrukiBossRenderer::new);
		event.registerEntityRenderer(CaldrukimodModEntities.CAPT.get(), CaptRenderer::new);
	}
}