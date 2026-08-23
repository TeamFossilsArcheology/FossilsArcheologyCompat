package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.minecraft.resources.ResourceLocation;

public class FarmerRespiteCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        item(plant, "wild_tea_bush", 1);
        item(plant, "tea_seeds", 1);
        item(plant, "green_tea_leaves", 1);
        item(plant, "yellow_tea_leaves", 1);
        item(plant, "black_tea_leaves", 1);
        item(plant, "coffee_berries");
        item(plant, "rose_hips", 5);
        item(plant, "green_tea_cookie");
        item(plant, "nether_wart_sourdough");
        item(fish, "black_cod");
        item(plant, "tea_curry");
        item(meat, "blazing_chili");
        item(plant, "coffee_cake", 7 * 3);
        item(plant, "coffee_cake_slice");
        item(plant, "rose_hip_pie", 3 * 4);
        //item(plant, "rose_hip_pie", getPieValue((PieBlock) FRBlocks.ROSE_HIP_PIE));
        item(plant, "rose_hip_pie_slice");
    }

    private static void item(FoodValueProvider.FoodAppender food, String key) {
        food.item(new ResourceLocation("farmersrespite", key));
    }

    private static void item(FoodValueProvider.FoodAppender food, String key, int value) {
        food.item(new ResourceLocation("farmersrespite", key), value);
    }
}
