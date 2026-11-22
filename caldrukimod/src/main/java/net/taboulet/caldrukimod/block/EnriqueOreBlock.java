package net.taboulet.caldrukimod.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class EnriqueOreBlock extends Block {
	public EnriqueOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("caldrukimod:enrique-que")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.step")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.place")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.hit")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.stone.fall")))).strength(2f).requiresCorrectToolForDrops());
	}
}