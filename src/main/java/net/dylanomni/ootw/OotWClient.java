package net.dylanomni.ootw;

import net.dylanomni.ootw.entity.projectile.OmniBeamEntity;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class OotWClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(OotW.OmniBeamEntityType, (context) ->
                new FlyingItemEntityRenderer(context));


    }
}
