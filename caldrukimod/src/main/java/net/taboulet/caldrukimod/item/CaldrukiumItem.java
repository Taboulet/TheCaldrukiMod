package net.taboulet.caldrukimod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CaldrukiumItem extends Item {
	public CaldrukiumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}