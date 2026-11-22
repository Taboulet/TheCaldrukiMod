/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.taboulet.caldrukimod.init;

import net.taboulet.caldrukimod.entity.*;
import net.taboulet.caldrukimod.CaldrukimodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class CaldrukimodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CaldrukimodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<HamsterdamEntity>> HAMSTERDAM = register("hamsterdam",
			EntityType.Builder.<HamsterdamEntity>of(HamsterdamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CalzoskiDogEntity>> CALZOSKI_DOG = register("calzoski_dog",
			EntityType.Builder.<CalzoskiDogEntity>of(CalzoskiDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FurryBossEntity>> FURRY_BOSS = register("furry_boss",
			EntityType.Builder.<FurryBossEntity>of(FurryBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<GalaxyNoteBossEntity>> GALAXY_NOTE_BOSS = register("galaxy_note_boss",
			EntityType.Builder.<GalaxyNoteBossEntity>of(GalaxyNoteBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeirdahhcryingfaceentityEntity>> WEIRDAHHCRYINGFACEENTITY = register("weirdahhcryingfaceentity",
			EntityType.Builder.<WeirdahhcryingfaceentityEntity>of(WeirdahhcryingfaceentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaldrukiBossEntity>> CALDRUKI_BOSS = register("caldruki_boss",
			EntityType.Builder.<CaldrukiBossEntity>of(CaldrukiBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaptEntity>> CAPT = register("capt",
			EntityType.Builder.<CaptEntity>of(CaptEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		HamsterdamEntity.init(event);
		CalzoskiDogEntity.init(event);
		FurryBossEntity.init(event);
		GalaxyNoteBossEntity.init(event);
		WeirdahhcryingfaceentityEntity.init(event);
		CaldrukiBossEntity.init(event);
		CaptEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HAMSTERDAM.get(), HamsterdamEntity.createAttributes().build());
		event.put(CALZOSKI_DOG.get(), CalzoskiDogEntity.createAttributes().build());
		event.put(FURRY_BOSS.get(), FurryBossEntity.createAttributes().build());
		event.put(GALAXY_NOTE_BOSS.get(), GalaxyNoteBossEntity.createAttributes().build());
		event.put(WEIRDAHHCRYINGFACEENTITY.get(), WeirdahhcryingfaceentityEntity.createAttributes().build());
		event.put(CALDRUKI_BOSS.get(), CaldrukiBossEntity.createAttributes().build());
		event.put(CAPT.get(), CaptEntity.createAttributes().build());
	}
}