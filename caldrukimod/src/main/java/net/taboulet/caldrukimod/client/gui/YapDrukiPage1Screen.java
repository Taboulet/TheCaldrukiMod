package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage1Menu;
import net.taboulet.caldrukimod.network.YapDrukiPage1ButtonMessage;
import net.taboulet.caldrukimod.init.CaldrukimodModScreens;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class YapDrukiPage1Screen extends AbstractContainerScreen<YapDrukiPage1Menu> implements CaldrukimodModScreens.FabricScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_empty;
	private static final Identifier BACKGROUND = Identifier.parse("caldrukimod:textures/screens/yap_druki_page_1.png");
	private static final Identifier IMAGE_0 = Identifier.parse("caldrukimod:textures/screens/yapdrukipage1.png");
	private static final Identifier IMAGE_1 = Identifier.parse("caldrukimod:textures/screens/buttonext.png");

	public YapDrukiPage1Screen(YapDrukiPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text, 200, 150);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -27, this.topPos + -27, 0, 0, 250, 200, 250, 200);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 130, this.topPos + 146, 0, 0, 25, 20, 25, 20);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = event.key();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(event);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + 130, this.topPos + 146, 25, 20, Component.translatable("gui.caldrukimod.yap_druki_page_1.button_empty"), e -> {
			int x = YapDrukiPage1Screen.this.x;
			int y = YapDrukiPage1Screen.this.y;
			if (true) {
				ClientPlayNetworking.send(new YapDrukiPage1ButtonMessage(0, x, y, z));
				YapDrukiPage1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty);
	}
}