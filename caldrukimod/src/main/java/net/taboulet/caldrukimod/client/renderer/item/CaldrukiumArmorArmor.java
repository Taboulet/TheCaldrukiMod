package net.taboulet.caldrukimod.client.renderer.item;

import net.taboulet.caldrukimod.init.CaldrukimodModItems;
import net.taboulet.caldrukimod.init.CaldrukimodModArmorModels;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CaldrukiumArmorArmor {
	public static void clientLoad() {
		CaldrukimodModArmorModels.ARMOR_MODELS.put(CaldrukimodModItems.CALDRUKIUM_ARMOR_HELMET, new CaldrukimodModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("caldrukimod:textures/entity/equipment/humanoid/diamond_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		CaldrukimodModArmorModels.ARMOR_MODELS.put(CaldrukimodModItems.CALDRUKIUM_ARMOR_CHESTPLATE, new CaldrukimodModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("caldrukimod:textures/entity/equipment/humanoid/diamond_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		CaldrukimodModArmorModels.ARMOR_MODELS.put(CaldrukimodModItems.CALDRUKIUM_ARMOR_LEGGINGS, new CaldrukimodModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("caldrukimod:textures/entity/equipment/humanoid_leggings/diamond_layer_2.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		CaldrukimodModArmorModels.ARMOR_MODELS.put(CaldrukimodModItems.CALDRUKIUM_ARMOR_BOOTS, new CaldrukimodModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("caldrukimod:textures/entity/equipment/humanoid/diamond_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
	}
}