package com.blaze.carmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("carmod")
public class CarMod {
    public CarMod() {
        ModItems.register();
        ModBlocks.register();
        ModEntities.register();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Setup recipes or other
    }
}