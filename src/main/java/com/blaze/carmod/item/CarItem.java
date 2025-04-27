package com.blaze.carmod.item;

import com.blaze.carmod.ModEntities;
import com.blaze.carmod.entity.CarEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class CarItem extends Item {
    public CarItem(Properties props) { super(props); }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide) {
            CarEntity car = new CarEntity(ModEntities.CAR.get(), world);
            car.setPos(context.getClickLocation().x, context.getClickLocation().y, context.getClickLocation().z);
            world.addFreshEntity(car);
            context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
}