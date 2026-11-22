/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.gui.YapDrukiPage2Screen;
import net.taboulet.caldrukimod.client.gui.YapDrukiPage1Screen;
import net.taboulet.caldrukimod.client.gui.SoundboardNormalScreen;
import net.taboulet.caldrukimod.client.gui.JonklanchortestScreen;
import net.taboulet.caldrukimod.client.gui.JonklanchortPortalGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class CaldrukimodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CaldrukimodModMenus.SOUNDBOARD_NORMAL.get(), SoundboardNormalScreen::new);
		event.register(CaldrukimodModMenus.YAP_DRUKI_PAGE_1.get(), YapDrukiPage1Screen::new);
		event.register(CaldrukimodModMenus.JONKLANCHORTEST.get(), JonklanchortestScreen::new);
		event.register(CaldrukimodModMenus.JONKLANCHORT_PORTAL_GUI.get(), JonklanchortPortalGUIScreen::new);
		event.register(CaldrukimodModMenus.YAP_DRUKI_PAGE_2.get(), YapDrukiPage2Screen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}