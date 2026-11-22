package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage2Menu;
import net.taboulet.caldrukimod.network.YapDrukiPage2ButtonMessage;
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

public class YapDrukiPage2Screen extends AbstractContainerScreen<YapDrukiPage2Menu> implements CaldrukimodModScreens.FabricScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_empty;
	private Button button_empty1;
	private static final Identifier BACKGROUND = Identifier.parse("caldrukimod:textures/screens/yap_druki_page_2.png");
	private static final Identifier IMAGE_0 = Identifier.parse("caldrukimod:textures/screens/yapdrukipage2bside.png");
	private static final Identifier IMAGE_1 = Identifier.parse("caldrukimod:textures/screens/buttonext.png");
	private static final Identifier IMAGE_2 = Identifier.parse("caldrukimod:textures/screens/buttonback.png");

	public YapDrukiPage2Screen(YapDrukiPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text, 250, 200);
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -2, this.topPos + -2, 0, 0, 250, 200, 250, 200);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 155, this.topPos + 171, 0, 0, 25, 20, 25, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 58, this.topPos + 171, 0, 0, 25, 20, 25, 20);
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
		button_empty = new PlainTextButton(this.leftPos + 155, this.topPos + 171, 25, 20, Component.translatable("gui.caldrukimod.yap_druki_page_2.button_empty"), e -> {
			int x = YapDrukiPage2Screen.this.x;
			int y = YapDrukiPage2Screen.this.y;
			if (true) {
				ClientPlayNetworking.send(new YapDrukiPage2ButtonMessage(0, x, y, z));
				YapDrukiPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + 58, this.topPos + 171, 25, 20, Component.translatable("gui.caldrukimod.yap_druki_page_2.button_empty1"), e -> {
			int x = YapDrukiPage2Screen.this.x;
			int y = YapDrukiPage2Screen.this.y;
			if (true) {
				ClientPlayNetworking.send(new YapDrukiPage2ButtonMessage(1, x, y, z));
				YapDrukiPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty1);
	}
}