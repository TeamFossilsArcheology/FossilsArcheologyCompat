package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.scouter.oceansdelight.items.ODItems;

public class OceanDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        fish.item(ODItems.TENTACLES);
        fish.item(ODItems.CUT_TENTACLES);
        fish.item(ODItems.SQUID_RINGS);
        fish.item(ODItems.TENTACLE_ON_A_STICK);
        fish.item(ODItems.BAKED_TENTACLE_ON_A_STICK);
        fish.item(ODItems.BOWL_OF_GUARDIAN_SOUP);
        fish.item(ODItems.GUARDIAN_TAIL);
        fish.item(ODItems.COOKED_GUARDIAN_TAIL);
        fish.item(ODItems.ELDER_GUARDIAN_SLAB);
        fish.item(ODItems.ELDER_GUARDIAN_SLICE);
        fish.item(ODItems.COOKED_ELDER_GUARDIAN_SLICE);
        fish.item(ODItems.ELDER_GUARDIAN_ROLL);
        fish.item(ODItems.CABBAGE_WRAPPED_ELDER_GUARDIAN);
        fish.item(ODItems.FUGU_SLICE);
        fish.item(ODItems.FUGU_ROLL);
        plant.item(ODItems.BRAISED_SEA_PICKLE);
        //16/16 added
    }
}
