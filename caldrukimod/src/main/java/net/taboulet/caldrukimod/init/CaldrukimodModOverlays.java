/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.client.screens.HiCurseOverlayOverlay;
import net.taboulet.caldrukimod.client.screens.FurryOverlayOverlay;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.resources.Identifier;

import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaldrukimodModOverlays {
	public static void clientLoad() {
		register("hi_curse_overlay", HiCurseOverlayOverlay::render);
		register("furry_overlay", FurryOverlayOverlay::render);
	}

	private static void register(Identifier identifier, String registryname, HudElement element) {
		HudElementRegistry.attachElementAfter(identifier, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), element);
	}

	private static void register(String registryname, HudElement element) {
		register(VanillaHudElements.MISC_OVERLAYS, registryname, element);
	}
}