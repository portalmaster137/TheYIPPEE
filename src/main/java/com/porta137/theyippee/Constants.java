package com.porta137.theyippee;

import com.porta137.theyippee.items.YippeeItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Constants {

    public static final Identifier YIPPIE_SOUND_ID = new Identifier("theyippee:yippee_sound");
    public static SoundEvent YIPPEE_SOUND = SoundEvent.of(YIPPIE_SOUND_ID);

    public static final YippeeItem YIPPIE_ITEM = new YippeeItem(new Item.Settings());

    public static final ItemGroup YIPPEE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(YIPPIE_ITEM))
            .displayName(Text.translatable("itemGroup.theyippee.group"))
            .entries((ctx,ent) -> ent.add(YIPPIE_ITEM))
            .build();

}
