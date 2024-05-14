package com.porta137.theyippee.entity.client;

import com.porta137.theyippee.entity.custom.YippeeCreature;
import com.porta137.theyippee.util.Constants;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class YippeeModel extends GeoModel<YippeeCreature> {


    @Override
    public Identifier getModelResource(YippeeCreature animatable) {
        return new Identifier(Constants.MOD_ID, "geo/yippee_creature.geo.json");
    }

    @Override
    public Identifier getTextureResource(YippeeCreature animatable) {
        return new Identifier(Constants.MOD_ID, "textures/entity/yippee_creature.png");
    }

    @Override
    public Identifier getAnimationResource(YippeeCreature animatable) {
        return new Identifier(Constants.MOD_ID, "animations/yippee_creature.animation.json");
    }

    @Override
    public void setCustomAnimations(YippeeCreature animatable, long instanceId, AnimationState<YippeeCreature> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");
        if (head != null) {
            EntityModelData EMD = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(EMD.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(EMD.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
