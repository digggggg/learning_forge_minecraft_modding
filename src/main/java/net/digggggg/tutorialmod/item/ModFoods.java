package net.digggggg.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).saturationMod(2).effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();
}
