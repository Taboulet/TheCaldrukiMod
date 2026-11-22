package net.taboulet.caldrukimod.client.gui;

import net.taboulet.caldrukimod.world.inventory.SoundboardNormalMenu;
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
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphicsExtractor;

public class SoundboardNormalScreen extends AbstractContainerScreen<SoundboardNormalMenu> implements CaldrukimodModScreens.FabricScreenAccessor {
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
	private CaldrukimodModScreens.ExtendedSlider Pitch;
	private static final Identifier BACKGROUND = Identifier.parse("caldrukimod:textures/screens/soundboard_normal.png");
	private static final Identifier IMAGE_0 = Identifier.parse("caldrukimod:textures/screens/buttonjonkler.png");
	private static final Identifier IMAGE_1 = Identifier.parse("caldrukimod:textures/screens/buttonadrian.png");
	private static final Identifier IMAGE_2 = Identifier.parse("caldrukimod:textures/screens/buttonenrique.png");
	private static final Identifier IMAGE_3 = Identifier.parse("caldrukimod:textures/screens/buttonanglegrinder.png");
	private static final Identifier IMAGE_4 = Identifier.parse("caldrukimod:textures/screens/buttonfar.png");
	private static final Identifier IMAGE_5 = Identifier.parse("caldrukimod:textures/screens/buttonminimumjonkler.png");

	public SoundboardNormalScreen(SoundboardNormalMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 176, 166);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 1 && elementState instanceof Boolean logicState) {
			if (name.equals("Autotune")) {
				if (Autotune.selected() != logicState)
					Autotune.onPress(null);
			}
		}
		if (elementType == 2 && elementState instanceof Number n) {
			if (name.equals("Pitch"))
				Pitch.setValue(n.doubleValue());
		}
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 9, this.topPos + 68, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 9, this.topPos + 17, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 96, this.topPos + 17, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 9, this.topPos + 42, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 96, this.topPos + 42, 0, 0, 65, 20, 65, 20);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 96, this.topPos + 68, 0, 0, 65, 20, 65, 20);
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
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_adrian"), 32, 21, -1, false);
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_enrique"), 119, 21, -1, false);
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_angle_grinder"), 32, 46, -1, false);
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_fart"), 119, 47, -1, false);
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_syfm"), 119, 72, -1, false);
		guiGraphics.text(this.font, Component.translatable("gui.caldrukimod.soundboard_normal.label_text"), 31, 72, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + 9, this.topPos + 17, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + 96, this.topPos + 17, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty1"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new PlainTextButton(this.leftPos + 9, this.topPos + 42, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty2"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new PlainTextButton(this.leftPos + 96, this.topPos + 42, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty3"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new PlainTextButton(this.leftPos + 9, this.topPos + 68, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty4"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty4);
		button_empty5 = new PlainTextButton(this.leftPos + 96, this.topPos + 68, 65, 20, Component.translatable("gui.caldrukimod.soundboard_normal.button_empty5"), e -> {
		}, this.font);
		this.addRenderableWidget(button_empty5);
		Autotune = Checkbox.builder(Component.translatable("gui.caldrukimod.soundboard_normal.Autotune"), this.font).pos(this.leftPos + 16, this.topPos + 136).onValueChange((checkbox, value) -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 1, "Autotune", value, false);
		}).build();
		this.addRenderableWidget(Autotune);
		Pitch = new CaldrukimodModScreens.ExtendedSlider(this.leftPos + 35, this.topPos + 103, 100, 20, Component.translatable("gui.caldrukimod.soundboard_normal.Pitch_prefix"),
				Component.translatable("gui.caldrukimod.soundboard_normal.Pitch_suffix"), 0.5, 5, 1, 0.5, 0, true) {
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