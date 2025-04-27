package com.blaze.carmod.item;

import com.blaze.carmod.entity.CarEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class EngineItem extends Item {
    public EngineItem(Properties props) { super(props); }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, EntityHitResult target, InteractionHand hand) {
        if (target.getEntity() instanceof CarEntity car && car.isEngineBroken()) {
            car.repairEngine();
            stack.shrink(1);
            return InteractionResult.SUCCESS;
        }
        return super.interactLivingEntity(stack, player, target, hand);
    }
}