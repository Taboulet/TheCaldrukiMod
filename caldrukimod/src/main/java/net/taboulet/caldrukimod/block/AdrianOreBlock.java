package net.taboulet.caldrukimod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class AdrianOreBlock extends Block {
	public AdrianOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new SoundType(1.0f, 1.0f, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("caldrukimod:adrian-block-break")), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.step")),
				BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.place")), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.hit")), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.fall"))))
				.strength(2f).requiresCorrectToolForDrops());
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(ResourceKey.create(Registries.BIOME, Identifier.parse("caldrukimod:hamster_biome")));
}