package net.taboulet.caldrukimod.client.screens;

import net.taboulet.caldrukimod.procedures.FurryEffectOverlayDisplayProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.DeltaTracker;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class FurryOverlayOverlay {
	private static final Identifier BACKGROUND = Identifier.parse("caldrukimod:textures/screens/furryoverlaynotfinal.png");

	public static void render(GuiGraphicsExtractor guiGraphics, DeltaTracker deltaTracker) {
		int w = guiGraphics.guiWidth();
		int h = guiGraphics.guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (FurryEffectOverlayDisplayProcedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, 0, 0, 0, 0, w, h, w, h);
		}
	}
}