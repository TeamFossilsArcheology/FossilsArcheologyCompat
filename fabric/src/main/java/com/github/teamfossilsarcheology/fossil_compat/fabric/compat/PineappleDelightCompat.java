package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.minecraft.resources.ResourceLocation;

public class PineappleDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        item(plant, "pineapple");
        item(plant, "pineapple_side");
        item(plant, "pineapple_pie_side");
        item(plant, "pineapple_fried_rice");
        item(plant, "pineapple_cake_slice");

        block(plant, "pineapple_pie", 4);
        block(plant, "pineapple_cake", 3 * 4);
        block(plant, "pineapple_wild_crop", 1);
        block(plant, "pineapple_crop", 1);
    }

    private static void item(FoodValueProvider.FoodAppender food, String key) {
        food.item(new ResourceLocation("pineapple_delight", key));
    }

    private static void item(FoodValueProvider.FoodAppender food, String key, int value) {
        food.item(new ResourceLocation("pineapple_delight", key), value);
    }

    private static void block(FoodValueProvider.FoodAppender food, String key, int value) {
        food.block(new ResourceLocation("pineapple_delight", key), value);
    }
}
