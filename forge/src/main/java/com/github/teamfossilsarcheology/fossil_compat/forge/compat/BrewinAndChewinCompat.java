package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.brewinandchewin.core.registry.BCItems;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class BrewinAndChewinCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(BCItems.KIMCHI.get());
        meat.item(BCItems.JERKY.get());
        plant.item(BCItems.PICKLED_PICKLES.get());
        fish.item(BCItems.KIPPERS.get());
        plant.item(BCItems.COCOA_FUDGE.get());
        plant.item(BCItems.KIMCHI.get());
        meat.item(BCItems.PIZZA_SLICE.get()); //Contains meat
        meat.item(BCItems.HAM_AND_CHEESE_SANDWICH.get());
        //8/8 added
    }
}
