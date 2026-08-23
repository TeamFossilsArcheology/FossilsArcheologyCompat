package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import alabaster.crabbersdelight.common.registry.ModItems;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class CrabberDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        fish.item(ModItems.BISQUE.get()); //Dish made of fish+plants, so I considered it a fish
        fish.item(ModItems.CLAM_BAKE.get()); //Dish made of fish+plants, so I considered it a fish
        meat.item(ModItems.CLAM_CHOWDER.get()); //Dish made of clam meat+plants, so I considered it a meat
        meat.item(ModItems.COOKED_CLAM_MEAT.get()); //Clam meat so meat
        fish.item(ModItems.COOKED_CLAWSTER.get());
        fish.item(ModItems.COOKED_CRAB.get());
        fish.item(ModItems.COOKED_SHRIMP.get());
        fish.item(ModItems.COOKED_TROPICAL_FISH.get());
        fish.item(ModItems.COOKED_TROPICAL_FISH_SLICE.get());
        fish.item(ModItems.CRAB_CAKES.get()); //Has crab in it so I will count it as a fish
        fish.item(ModItems.CRAB_LEGS.get());
        fish.item(ModItems.FISH_STICK.get());
        plant.item(ModItems.KELP_SHAKE.get(), 5); //This is a drink but it is made of kelp so plant
        meat.item(ModItems.RAW_CLAM_MEAT.get());
        fish.item(ModItems.RAW_CLAWSTER.get());
        fish.item(ModItems.RAW_CRAB.get());
        fish.item(ModItems.RAW_SHRIMP.get());
        meat.item(ModItems.SEAFOOD_GUMBO.get()); //Dish made of meat, fish+plants, so I considered it a meat
        fish.item(ModItems.SHRIMP_SKEWER.get());
        fish.item(ModItems.STUFFED_NAUTILUS_SHELL.get());
        meat.item(ModItems.SURF_AND_TURF.get()); //Made of fish and meat, so meat
        fish.item(ModItems.TROPICAL_FISH_SLICE.get());
        //22/22 added
    }
}
