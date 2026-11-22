package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.SoundboardNormalMenu;
import net.taboulet.caldrukimod.network.SoundboardNormalButtonMessage;
import net.taboulet.caldrukimod.init.CaldrukimodModScreens;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.gui.widget.ExtendedSlider;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

public class SoundboardNormalScreen extends AbstractContainerScreen<SoundboardNormalMenu> implements CaldrukimodModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Checkbox Autotune;
	private Button button_empty;
	private Button button_empty1;
	private Button button_empty2;
	private Button button_empty3;
	private Button button_empty4;
	private Button button_empty5;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("caldrukimod:textures/screens/soundboard_normal.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("caldrukimod:textures/screens/buttonjonkler.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("caldrukimod:textures/screens/buttonadrian.png");
	private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("caldrukimod:textures/screens/buttonenrique.png");
	private static final ResourceLocation IMAGE_3 = ResourceLocation.parse("caldrukimod:textures/screens/buttonanglegrinder.png");
	private static final ResourceLocation IMAGE_4 = ResourceLocation.parse("caldrukimod:textures/screens/buttonfar.png");
	private static final ResourceLocation IMAGE_5 = ResourceLocation.parse("caldrukimod:textures/screens/buttonminimumjonkler.png");
	private ExtendedSlider Pitch;

	public SoundboardNormalScreen(SoundboardNormalMenu container, Inventory inventory, Component text) {
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
		if (elementType == 1 && elementState instanceof Boolean logicState) {
			if (name.equals("Autotune")) {
				if (Autotune.selected() != logicState)
					Autotune.onPress();
			}
		}
		if (elementType == 2 && elementState instanceof Number n) {
			if (name.equals("Pitch"))
				Pitch.setValue(n.doubleValue());
		}
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
		guiGraphics.blit(IMAGE_0, this.leftPos + 9, this.topPos + 68, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(IMAGE_1, this.leftPos + 9, this.topPos + 17, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(IMAGE_2, this.leftPos + 96, this.topPos + 17, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(IMAGE_3, this.leftPos + 9, this.topPos + 42, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(IMAGE_4, this.leftPos + 96, this.topPos + 42, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(IMAGE_5, this.leftPos + 96, this.topPos + 68, 0, 0, 65, 20, 65, 20);
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
	public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
		return (this.getFocused() != null && this.isDragging() && button == 0) ? this.getFocused().mouseDragged(mouseX, mouseY, button, dragX, dragY) : super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_adrian"), 32, 21, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_enrique"), 119, 21, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_angle_grinder"), 32, 46, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_fart"), 119, 47, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_syfm"), 119, 72, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_text"), 31, 72, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + 9, this.topPos + 17, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(0, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + 96, this.topPos + 17, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty1"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(1, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new PlainTextButton(this.leftPos + 9, this.topPos + 42, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty2"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(2, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new PlainTextButton(this.leftPos + 96, this.topPos + 42, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty3"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(3, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new PlainTextButton(this.leftPos + 9, this.topPos + 68, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty4"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(4, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty4);
		button_empty5 = new PlainTextButton(this.leftPos + 96, this.topPos + 68, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty5"), e -> {
			int x = SoundboardNormalScreen.this.x;
			int y = SoundboardNormalScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SoundboardNormalButtonMessage(5, x, y, z));
				SoundboardNormalButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_empty5);
		Autotune = Checkbox.builder(Component.translatable("gui.caldrukimod.soundboard_normal.Autotune"), this.font).pos(this.leftPos + 16, this.topPos + 136).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "Autotune", value, false);
		}).build();
		this.addRenderableWidget(Autotune);
		Pitch = new ExtendedSlider(this.leftPos + 35, this.topPos + 103, 100, 20, Component.translatable("gui.caldrukimod.soundboard_normal.Pitch_prefix"), Component.translatable("gui.caldrukimod.soundboard_normal.Pitch_suffix"), 0.5, 5, 1, 0.5, 0,
				true) {
			@Override
			protected void applyValue() {
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 2, "Pitch", this.getValue(), false);
			}
		};
		this.addRenderableWidget(Pitch);
		if (!menuStateUpdateActive)
			menu.sendMenuStateUpdate(entity, 2, "Pitch", Pitch.getValue(), false);
	}
}