package com.blaze.carmod.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class CarRenderer extends BoatRenderer<CarEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("carmod", "textures/entity/car/texture.png");
    public CarRenderer(EntityRendererProvider.Context context) {
        super(context, 0.5f, true);
    }

    @Override
    public ResourceLocation getTextureLocation(CarEntity entity) {
        return TEXTURE;
    }
}