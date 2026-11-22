/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage2Menu;
import net.taboulet.caldrukimod.world.inventory.YapDrukiPage1Menu;
import net.taboulet.caldrukimod.world.inventory.SoundboardNormalMenu;
import net.taboulet.caldrukimod.network.MenuStateUpdateMessage;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.Map;

public class CaldrukimodModMenus {
	public static MenuType<SoundboardNormalMenu> SOUNDBOARD_NORMAL;
	public static MenuType<YapDrukiPage1Menu> YAP_DRUKI_PAGE_1;
	public static MenuType<YapDrukiPage2Menu> YAP_DRUKI_PAGE_2;

	public static void load() {
		SOUNDBOARD_NORMAL = register("soundboard_normal", SoundboardNormalMenu::new);
		SoundboardNormalMenu.screenInit();
		YAP_DRUKI_PAGE_1 = register("yap_druki_page_1", YapDrukiPage1Menu::new);
		YapDrukiPage1Menu.screenInit();
		YAP_DRUKI_PAGE_2 = register("yap_druki_page_2", YapDrukiPage2Menu::new);
		YapDrukiPage2Menu.screenInit();
		PayloadTypeRegistry.serverboundPlay().register(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage.STREAM_CODEC);
		ServerPlayNetworking.registerGlobalReceiver(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage::handleMenuState);
	}

	public static void clientLoad() {
		PayloadTypeRegistry.clientboundPlay().register(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage.STREAM_CODEC);
		ClientPlayNetworking.registerGlobalReceiver(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage::handleClientMenuState);
	}

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				ServerPlayNetworking.send(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide()) {
				if (Minecraft.getInstance().gui.screen() instanceof CaldrukimodModScreens.FabricScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPlayNetworking.send(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}

	private static <M extends AbstractContainerMenu> MenuType<M> register(String registryname, MenuType.MenuSupplier<M> element) {
		return Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname), new MenuType<>(element, FeatureFlags.DEFAULT_FLAGS));
	}

	public interface BoundBlock {
		Class<? extends AbstractContainerMenu> getBoundMenuClass();
	}
}