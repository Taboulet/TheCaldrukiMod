/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.world.inventory.YapDrukiPage2Menu;
import net.taboulet.caldrukimod.world.inventory.YapDrukiPage1Menu;
import net.taboulet.caldrukimod.world.inventory.SoundboardNormalMenu;
import net.taboulet.caldrukimod.world.inventory.JonklanchortestMenu;
import net.taboulet.caldrukimod.world.inventory.JonklanchortPortalGUIMenu;
import net.taboulet.caldrukimod.network.MenuStateUpdateMessage;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class CaldrukimodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CaldrukimodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SoundboardNormalMenu>> SOUNDBOARD_NORMAL = REGISTRY.register("soundboard_normal", () -> IMenuTypeExtension.create(SoundboardNormalMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<YapDrukiPage1Menu>> YAP_DRUKI_PAGE_1 = REGISTRY.register("yap_druki_page_1", () -> IMenuTypeExtension.create(YapDrukiPage1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<JonklanchortestMenu>> JONKLANCHORTEST = REGISTRY.register("jonklanchortest", () -> IMenuTypeExtension.create(JonklanchortestMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<JonklanchortPortalGUIMenu>> JONKLANCHORT_PORTAL_GUI = REGISTRY.register("jonklanchort_portal_gui", () -> IMenuTypeExtension.create(JonklanchortPortalGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<YapDrukiPage2Menu>> YAP_DRUKI_PAGE_2 = REGISTRY.register("yap_druki_page_2", () -> IMenuTypeExtension.create(YapDrukiPage2Menu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide()) {
				if (Minecraft.getInstance().gui.screen() instanceof CaldrukimodModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
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

	public interface BoundBlock {
		Class<? extends AbstractContainerMenu> getBoundMenuClass();
	}
}