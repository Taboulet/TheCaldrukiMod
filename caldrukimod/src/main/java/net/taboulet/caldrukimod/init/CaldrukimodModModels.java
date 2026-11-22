/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.model.*;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class CaldrukimodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeleviskintruly.LAYER_LOCATION, Modeleviskintruly::createBodyLayer);
		event.registerLayerDefinition(Modelweirdahhcryingface.LAYER_LOCATION, Modelweirdahhcryingface::createBodyLayer);
		event.registerLayerDefinition(ModelHamsterdam.LAYER_LOCATION, ModelHamsterdam::createBodyLayer);
		event.registerLayerDefinition(Modelfurry.LAYER_LOCATION, Modelfurry::createBodyLayer);
		event.registerLayerDefinition(ModelNew.LAYER_LOCATION, ModelNew::createBodyLayer);
		event.registerLayerDefinition(Modelgalaxynote.LAYER_LOCATION, Modelgalaxynote::createBodyLayer);
		event.registerLayerDefinition(Modelcapt.LAYER_LOCATION, Modelcapt::createBodyLayer);
	}
}