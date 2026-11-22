/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.renderer.*;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaldrukimodModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(CaldrukimodModEntities.HAMSTERDAM, HamsterdamRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.CALZOSKI_DOG, CalzoskiDogRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.FURRY_BOSS, FurryBossRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.GALAXY_NOTE_BOSS, GalaxyNoteBossRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.WEIRDAHHCRYINGFACEENTITY, WeirdahhcryingfaceentityRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.CALDRUKI_BOSS, CaldrukiBossRenderer::new);
		EntityRendererRegistry.register(CaldrukimodModEntities.CAPT, CaptRenderer::new);
	}
}