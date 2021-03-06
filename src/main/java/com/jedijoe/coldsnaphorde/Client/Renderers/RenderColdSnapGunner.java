package com.jedijoe.coldsnaphorde.Client.Renderers;

import com.jedijoe.coldsnaphorde.Client.Models.ColdSnapGunnerModel;
import com.jedijoe.coldsnaphorde.ColdSnapHorde;
import com.jedijoe.coldsnaphorde.Entities.Mobs.ColdSnapGunner;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderColdSnapGunner extends MobRenderer<ColdSnapGunner, ColdSnapGunnerModel<ColdSnapGunner>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ColdSnapHorde.MOD_ID, "textures/entity/coldsnapgunner.png");

    public RenderColdSnapGunner(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ColdSnapGunnerModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(ColdSnapGunner entity) {
        return TEXTURE;
    }
}
