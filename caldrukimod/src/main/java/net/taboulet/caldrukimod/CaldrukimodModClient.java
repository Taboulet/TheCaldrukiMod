package net.taboulet.caldrukimod;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;
import net.taboulet.caldrukimod.init.*;
import net.taboulet.caldrukimod.client.CaldrukimodModSkyboxRenderer;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class CaldrukimodModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		CaldrukimodModModels.clientLoad();
		CaldrukimodModArmorModels.clientLoad();
		CaldrukimodModEntityRenderers.clientLoad();
		CaldrukimodModParticles.clientLoad();
		CaldrukimodModScreens.clientLoad();
		CaldrukimodModMenus.clientLoad();
		CaldrukimodModSkyboxRenderer.renderSky();
		ClientPlayNetworking.registerGlobalReceiver(CaldrukimodModVariables.PlayerVariablesSyncMessage.TYPE, CaldrukimodModVariables.PlayerVariablesSyncMessage::handleData);
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}