package com.porta137.theyippee;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TheYIPPEE implements ModInitializer {





    public static final Identifier SOUND_ID = new Identifier("theyippee:yippee_sound");
    public static SoundEvent YIPPEE_SOUND = SoundEvent.of(SOUND_ID);

    public static final YippeeItem YIPPIE_ITEM = new YippeeItem(new Item.Settings());

    private static final ItemGroup YIPPEE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(YIPPIE_ITEM))
            .displayName(Text.translatable("itemGroup.theyippee.group"))
            .entries((ctx,ent) -> ent.add(YIPPIE_ITEM))
            .build();

    public void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("theyippee", "yippee_group"), YIPPEE_GROUP);
    }

    public void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("theyippee", "yippee"), YIPPIE_ITEM);
    }

    public void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, SOUND_ID, YIPPEE_SOUND);
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
