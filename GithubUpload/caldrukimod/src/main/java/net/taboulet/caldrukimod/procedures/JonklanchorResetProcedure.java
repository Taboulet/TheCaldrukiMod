package net.taboulet.caldrukimod.procedures;

import net.taboulet.caldrukimod.network.CaldrukimodModVariables;
import net.taboulet.caldrukimod.init.CaldrukimodModMenus;
import net.taboulet.caldrukimod.init.CaldrukimodModItems;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class JonklanchorResetProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CaldrukimodModItems.JONKLANCHOR.get()) {
			{
				final String _tagName = "IsAnchored";
				final boolean _tagValue = true;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorX";
				final double _tagValue = x;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorY";
				final double _tagValue = y;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorZ";
				final double _tagValue = z;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorDimension";
				final String _tagValue = (entity.level().dimension() + "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorTexture";
				final double _tagValue = entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastChosenOption;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (!(((entity instanceof Player _entity15 && _entity15.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu15) ? _menu15.getMenuState(0, "AnchorNameTextField", "") : "").equals(""))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
						Component.literal(((entity instanceof Player _entity16 && _entity16.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu16) ? _menu16.getMenuState(0, "AnchorNameTextField", "") : "")));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CaldrukimodModItems.JONKLANCHOR.get()) {
			{
				final String _tagName = "IsAnchored";
				final boolean _tagValue = true;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorX";
				final double _tagValue = x;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorY";
				final double _tagValue = y;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorZ";
				final double _tagValue = z;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorDimension";
				final String _tagValue = (entity.level().dimension() + "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
			}
			{
				final String _tagName = "AnchorTexture";
				final double _tagValue = entity.getData(CaldrukimodModVariables.PLAYER_VARIABLES).LastChosenOption;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (!(((entity instanceof Player _entity34 && _entity34.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu34) ? _menu34.getMenuState(0, "AnchorNameTextField", "") : "").equals(""))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME,
						Component.literal(((entity instanceof Player _entity35 && _entity35.containerMenu instanceof CaldrukimodModMenus.MenuAccessor _menu35) ? _menu35.getMenuState(0, "AnchorNameTextField", "") : "")));
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}