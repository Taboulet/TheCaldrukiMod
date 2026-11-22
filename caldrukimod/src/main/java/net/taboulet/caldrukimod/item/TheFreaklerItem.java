package net.taboulet.caldrukimod.item;

import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.InteractionResult;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import java.util.List;

public class TheFreaklerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4000, 4f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("caldrukimod:the_freakler_repair_items")));

	public TheFreaklerItem(Item.Properties properties) {
		super(TOOL_MATERIAL.applyToolProperties(properties, BlockTags.MINEABLE_WITH_PICKAXE, 19f, -3f, 0)
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 19, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build())
				.rarity(Rarity.EPIC));
	}

	@Override
	public boolean isCorrectToolForDrops(ItemStack itemstack, BlockState blockstate) {
		return blockstate.is(BlockTags.MINEABLE_WITH_AXE) || blockstate.is(BlockTags.MINEABLE_WITH_HOE) || blockstate.is(BlockTags.MINEABLE_WITH_PICKAXE) || blockstate.is(BlockTags.MINEABLE_WITH_SHOVEL);
	}

	@Override
	public boolean canPerformAction(ItemInstance stack, ItemAbility toolAction) {
		return toolAction == ItemAbilities.SHOVEL_DOUSE || toolAction == ItemAbilities.SWORD_SWEEP;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
		return 4f;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Registry<BlockTransformer> transformers = context.getLevel().registryAccess().lookupOrThrow(Registries.BLOCK_TRANSFORMER);
		InteractionResult result = InteractionResult.PASS;
		for (ResourceKey<BlockTransformer> transformer : List.of(BlockTransformers.AXE, BlockTransformers.HOE, BlockTransformers.SHOVEL)) {
			result = transformers.getOrThrow(transformer).value().transformBlock(context);
			if (result != InteractionResult.PASS)
				break;
		}
		return result;
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		itemstack.hurtAndBreak(1, entity, entity.getUsedItemHand().asEquipmentSlot());
		return true;
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		itemstack.hurtAndBreak(2, entity, entity.getUsedItemHand().asEquipmentSlot());
	}
}