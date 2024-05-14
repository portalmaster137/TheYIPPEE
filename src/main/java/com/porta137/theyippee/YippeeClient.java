package com.porta137.theyippee;

import com.porta137.theyippee.entity.ModEntities;
import com.porta137.theyippee.entity.client.YippeeRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class YippeeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.YIPPEE_CREATURE_ENTITY_TYPE, YippeeRenderer::new);
    }
}
