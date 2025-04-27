package com.blaze.carmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Boat;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class CarEntity extends Boat {
    private boolean engineBroken = false;

    public CarEntity(EntityType<? extends CarEntity> type, Level world) {
        super(world, 0, 0, 0);
    }

    @Override
    public void tick() {
        super.tick();
        if (!engineBroken && this.isInWater()) {
            engineBroken = true;
            this.deltaMovement = this.deltaMovement.multiply(0, 1, 0);
        }
        if (engineBroken) {
            this.setDeltaMovement(this.getDeltaMovement().add(0, -0.02, 0));
        }
    }

    public boolean isEngineBroken() {
        return engineBroken;
    }

    public void repairEngine() {
        engineBroken = false;
    }
}