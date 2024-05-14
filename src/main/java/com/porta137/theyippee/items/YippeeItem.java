package com.porta137.theyippee.items;

import com.porta137.theyippee.entity.ModEntities;
import com.porta137.theyippee.entity.custom.YippeeCreature;
import com.porta137.theyippee.util.Constants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class YippeeItem extends Item {

    public YippeeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(Constants.YIPPEE_SOUND, 1.0F, 1.0F);

        YippeeCreature entity = new YippeeCreature(ModEntities.YIPPEE_CREATURE_ENTITY_TYPE, world);
        entity.setPosition(user.getPos());
        world.spawnEntity(entity);

        return TypedActionResult.success(user.getStackInHand(hand));

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
       tooltip.add(Text.translatable("item.theyippee.yippee.tooltip"));
    }
}
