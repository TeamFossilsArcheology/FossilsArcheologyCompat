package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.spiteful_raccoon.honeyexpansion.init.BlockInit;
import com.spiteful_raccoon.honeyexpansion.init.ItemInit;

public class HoneyExpansionCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemInit.HONEY_BERRIES.get());
        plant.item(ItemInit.SLICE_OF_HONEY_CAKE.get());
        plant.item(ItemInit.HONEY_COOKIE_SAUSAGE.get());
        plant.item(ItemInit.PANCAKE.get());
        plant.item(ItemInit.HONEY_PANCAKE.get());
        plant.block(BlockInit.HONEY_CAKE.get(), 7 * FoodType.PLANT.multiplier() * 2);//7 slices by 2 food points
        //6/6 added
    }
}
