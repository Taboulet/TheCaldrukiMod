package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.JonklanchortestMenu;
import net.taboulet.caldrukimod.procedures.*;
import net.taboulet.caldrukimod.network.JonklanchortestButtonMessage;
import net.taboulet.caldrukimod.init.CaldrukimodModScreens;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;

public class JonklanchortestScreen extends AbstractContainerScreen<JonklanchortestMenu> implements CaldrukimodModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private EditBox AnchorNameTextField;
	private Button button_override_position;
	private Button button_empty;
	private Button button_empty1;
	private Button button_empty2;
	private Button button_empty3;
	private Button button_empty4;
	private Button button_reset;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("caldrukimod:textures/screens/jonklanchortest.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("caldrukimod:textures/screens/jonklanchornormal.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("caldrukimod:textures/screens/buttonpurple.png");
	private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("caldrukimod:textures/screens/buttonblue.png");
	private static final ResourceLocation IMAGE_3 = ResourceLocation.parse("caldrukimod:textures/screens/buttongreen.png");
	private static final ResourceLocation IMAGE_4 = ResourceLocation.parse("caldrukimod:textures/screens/buttonyellow.png");
	private static final ResourceLocation IMAGE_5 = ResourceLocation.parse("caldrukimod:textures/screens/buttonwhite.png");

	public JonklanchortestScreen(JonklanchortestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("AnchorNameTextField"))
				AnchorNameTextField.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		AnchorNameTextField.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(IMAGE_0, this.leftPos + 69, this.topPos + 127, 0, 0, 32, 32, 32, 32);
		if (JonklanchorButton0Procedure.execute(entity)) {
			guiGraphics.blit(IMAGE_1, this.leftPos + 9, this.topPos + 26, 0, 0, 25, 20, 25, 20);
		}
		if (JonklanchorButton1Procedure.execute(entity)) {
			guiGraphics.blit(IMAGE_2, this.leftPos + 41, this.topPos + 26, 0, 0, 25, 20, 25, 20);
		}
		if (JonklanchorButton2Procedure.execute(entity)) {
			guiGraphics.blit(IMAGE_3, this.leftPos + 75, this.topPos + 26, 0, 0, 25, 20, 25, 20);
		}
		if (JonklanchorButton3Procedure.execute(entity)) {
			guiGraphics.blit(IMAGE_4, this.leftPos + 109, this.topPos + 26, 0, 0, 25, 20, 25, 20);
		}
		if (JonklanchorButton4Procedure.execute(entity)) {
			guiGraphics.blit(IMAGE_5, this.leftPos + 142, this.topPos + 26, 0, 0, 25, 20, 25, 20);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (AnchorNameTextField.isFocused())
			return AnchorNameTextField.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String AnchorNameTextFieldValue = AnchorNameTextField.getValue();
		super.resize(minecraft, width, height);
		AnchorNameTextField.setValue(AnchorNameTextFieldValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.jonklanchortest.label_icon"), 75, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.jonklanchortest.label_name"), 6, 52, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		AnchorNameTextField = new EditBox(this.font, this.leftPos + 27, this.topPos + 66, 120, 20, Component.translatable("gui.caldrukimod.jonklanchortest.AnchorNameTextField"));
		AnchorNameTextField.setMaxLength(8192);
		AnchorNameTextField.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "AnchorNameTextField", content, false);
		});
		this.addWidget(this.AnchorNameTextField);
		button_override_position = Button.builder(Component.translatable("gui.caldrukimod.jonklanchortest.button_override_position"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(0, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 29, this.topPos + 95, 110, 20).build();
		this.addRenderableWidget(button_override_position);
		button_empty = new PlainTextButton(this.leftPos + 9, this.topPos + 26, 25, 20, Component.translatable("gui.caldrukimod.jonklanchortest.button_empty"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(1, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + 41, this.topPos + 26, 25, 20, Component.translatable("gui.caldrukimod.jonklanchortest.button_empty1"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(2, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new PlainTextButton(this.leftPos + 75, this.topPos + 26, 25, 20, Component.translatable("gui.caldrukimod.jonklanchortest.button_empty2"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (JonklanchorButton2Procedure.execute(entity)) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(3, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new PlainTextButton(this.leftPos + 109, this.topPos + 26, 25, 20, Component.translatable("gui.caldrukimod.jonklanchortest.button_empty3"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (JonklanchorButton3Procedure.execute(entity)) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(4, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new PlainTextButton(this.leftPos + 142, this.topPos + 26, 25, 20, Component.translatable("gui.caldrukimod.jonklanchortest.button_empty4"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (JonklanchorButton4Procedure.execute(entity)) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(5, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty4);
		button_reset = Button.builder(Component.translatable("gui.caldrukimod.jonklanchortest.button_reset"), e -> {
			int x = JonklanchortestScreen.this.x;
			int y = JonklanchortestScreen.this.y;
			if (JonklAnchorResetButtonConditionProcedure.execute(entity)) {
				PacketDistributor.sendToServer(new JonklanchortestButtonMessage(6, x, y, z));
				JonklanchortestButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 136, 50, 20).build();
		this.addRenderableWidget(button_reset);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_empty2.visible = JonklanchorButton2Procedure.execute(entity);
		this.button_empty3.visible = JonklanchorButton3Procedure.execute(entity);
		this.button_empty4.visible = JonklanchorButton4Procedure.execute(entity);
		this.button_reset.visible = JonklAnchorResetButtonConditionProcedure.execute(entity);
	}
}