package com.porta137.theyippee.entity;

import com.porta137.theyippee.entity.custom.YippeeCreature;
import com.porta137.theyippee.util.Constants;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<YippeeCreature> YIPPEE_CREATURE_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Constants.MOD_ID, "yippee_creature"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, YippeeCreature::new)
                    .dimensions(EntityDimensions.fixed(1.5F, 1.75f)).build()
    );

}
