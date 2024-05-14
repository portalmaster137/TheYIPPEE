package com.porta137.theyippee;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TheYIPPEE implements ModInitializer {




    public void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("theyippee", "yippee_group"), Constants.YIPPEE_GROUP);
    }

    public void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("theyippee", "yippee"), Constants.YIPPIE_ITEM);
    }

    public void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, Constants.YIPPIE_SOUND_ID, Constants.YIPPEE_SOUND);
    }

    Logger logger = LoggerFactory.getLogger(TheYIPPEE.class);

    @Override
    public void onInitialize() {

        registerItemGroups();
        registerItems();
        registerSounds();

        logger.info("Yippee! The YIPPEE is initialized!");
    }
}
