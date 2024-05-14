package com.porta137.theyippee;

import com.porta137.theyippee.entity.ModEntities;
import com.porta137.theyippee.entity.custom.YippeeCreature;
import com.porta137.theyippee.util.Constants;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class YippeeServer implements ModInitializer {




    public void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("theyippee", "yippee_group"), Constants.YIPPEE_GROUP);
    }

    public void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("theyippee", "yippee"), Constants.YIPPIE_ITEM);
    }

    public void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, Constants.YIPPIE_SOUND_ID, Constants.YIPPEE_SOUND);
    }

    Logger logger = LoggerFactory.getLogger(YippeeServer.class);

    @Override
    public void onInitialize() {

        registerItemGroups();
        registerItems();
        registerSounds();

        FabricDefaultAttributeRegistry.register(ModEntities.YIPPEE_CREATURE_ENTITY_TYPE, YippeeCreature.setAttributes());

        logger.info("Yippee! The YIPPEE is initialized!");
    }
}
