package com.porta137.theyippee.entity.client;

import com.porta137.theyippee.entity.custom.YippeeCreature;
import com.porta137.theyippee.util.Constants;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class YippeeRenderer extends GeoEntityRenderer<YippeeCreature> {

    public YippeeRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new YippeeModel());
    }

    @Override
    public Identifier getTextureLocation(YippeeCreature animatable) {
        return new Identifier(Constants.MOD_ID, "textures/entity/yippee_creature.png");
    }

    @Override
    public void render(YippeeCreature entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {

        if (entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
