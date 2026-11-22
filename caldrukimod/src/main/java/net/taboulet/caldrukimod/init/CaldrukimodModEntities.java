/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.entity.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class CaldrukimodModEntities {
	public static EntityType<HamsterdamEntity> HAMSTERDAM = register("hamsterdam", EntityType.Builder.<HamsterdamEntity>of(HamsterdamEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.8f));
	public static EntityType<CalzoskiDogEntity> CALZOSKI_DOG = register("calzoski_dog", EntityType.Builder.<CalzoskiDogEntity>of(CalzoskiDogEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.8f));
	public static EntityType<FurryBossEntity> FURRY_BOSS = register("furry_boss", EntityType.Builder.<FurryBossEntity>of(FurryBossEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.95f));
	public static EntityType<GalaxyNoteBossEntity> GALAXY_NOTE_BOSS = register("galaxy_note_boss", EntityType.Builder.<GalaxyNoteBossEntity>of(GalaxyNoteBossEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.notInPeaceful().sized(0.6f, 1.95f));
	public static EntityType<WeirdahhcryingfaceentityEntity> WEIRDAHHCRYINGFACEENTITY = register("weirdahhcryingfaceentity",
			EntityType.Builder.<WeirdahhcryingfaceentityEntity>of(WeirdahhcryingfaceentityEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

					.sized(0.6f, 1.8f));
	public static EntityType<CaldrukiBossEntity> CALDRUKI_BOSS = register("caldruki_boss", EntityType.Builder.<CaldrukiBossEntity>of(CaldrukiBossEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static EntityType<CaptEntity> CAPT = register("capt", EntityType.Builder.<CaptEntity>of(CaptEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.95f));

	public static void load() {
		init();
		registerAttributes();
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CaldrukimodMod.MODID, registryname))));
	}

	public static void init() {
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(HAMSTERDAM, HamsterdamEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CALZOSKI_DOG, CalzoskiDogEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(FURRY_BOSS, FurryBossEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(GALAXY_NOTE_BOSS, GalaxyNoteBossEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(WEIRDAHHCRYINGFACEENTITY, WeirdahhcryingfaceentityEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CALDRUKI_BOSS, CaldrukiBossEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CAPT, CaptEntity.createAttributes());
	}
}