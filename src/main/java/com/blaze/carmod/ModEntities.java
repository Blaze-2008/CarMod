package com.blaze.carmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, "carmod");

    public static final RegistryObject<EntityType<CarEntity>> CAR = ENTITIES.register("car",
        () -> EntityType.Builder.<CarEntity>of(CarEntity::new, MobCategory.MISC)
            .sized(1.5f, 1.0f)
            .build("car"));

    public static void register() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}