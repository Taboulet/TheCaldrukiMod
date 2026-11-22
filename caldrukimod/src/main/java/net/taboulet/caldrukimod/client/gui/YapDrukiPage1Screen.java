package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage1Menu;
import net.taboulet.caldrukimod.network.YapDrukiPage1ButtonMessage;
import net.taboulet.caldrukimod.init.CaldrukimodModScreens;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

public class YapDrukiPage1Screen extends AbstractContainerScreen<YapDrukiPage1Menu> implements CaldrukimodModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_empty;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("caldrukimod:textures/screens/yap_druki_page_1.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("caldrukimod:textures/screens/yapdrukipage1.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("caldrukimod:textures/screens/buttonext.png");

	public YapDrukiPage1Screen(YapDrukiPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 150;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(IMAGE_0, this.leftPos + -27, this.topPos + -27, 0, 0, 250, 200, 250, 200);
		guiGraphics.blit(IMAGE_1, this.leftPos + 130, this.topPos + 146, 0, 0, 25, 20, 25, 20);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + 130, this.topPos + 146, 25, 20, Component.translatable("gui.caldrukimod.yap_druki_page_1.button_empty"), e -> {
			int x = YapDrukiPage1Screen.this.x;
			int y = YapDrukiPage1Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new YapDrukiPage1ButtonMessage(0, x, y, z));
				YapDrukiPage1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty);
	}
}