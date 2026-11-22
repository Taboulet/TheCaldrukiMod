/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.model.*;

import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaldrukimodModModels {
	public static void clientLoad() {
		ModelLayerRegistry.registerModelLayer(Modeleviskintruly.LAYER_LOCATION, Modeleviskintruly::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(Modelweirdahhcryingface.LAYER_LOCATION, Modelweirdahhcryingface::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(ModelHamsterdam.LAYER_LOCATION, ModelHamsterdam::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(Modelfurry.LAYER_LOCATION, Modelfurry::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(ModelNew.LAYER_LOCATION, ModelNew::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(Modelgalaxynote.LAYER_LOCATION, Modelgalaxynote::createBodyLayer);
		ModelLayerRegistry.registerModelLayer(Modelcapt.LAYER_LOCATION, Modelcapt::createBodyLayer);
	}
}