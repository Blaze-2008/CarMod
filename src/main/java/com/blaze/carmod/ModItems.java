package com.blaze.carmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "carmod");

    public static final RegistryObject<Item> CAR_ITEM = ITEMS.register("car_item",
        () -> new CarItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ENGINE_ITEM = ITEMS.register("engine_item",
        () -> new EngineItem(new Item.Properties()));

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}