package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.scouter.oceansdelight.items.ODItems;

public class OceanDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        fish.item(ODItems.TENTACLES.get());
        fish.item(ODItems.CUT_TENTACLES.get());
        fish.item(ODItems.SQUID_RINGS.get());
        fish.item(ODItems.TENTACLE_ON_A_STICK.get());
        fish.item(ODItems.BAKED_TENTACLE_ON_A_STICK.get());
        fish.item(ODItems.BOWL_OF_GUARDIAN_SOUP.get());
        fish.item(ODItems.GUARDIAN_TAIL.get());
        fish.item(ODItems.COOKED_GUARDIAN_TAIL.get());
        fish.item(ODItems.ELDER_GUARDIAN_SLAB.get());
        fish.item(ODItems.ELDER_GUARDIAN_SLICE.get());
        fish.item(ODItems.COOKED_ELDER_GUARDIAN_SLICE.get());
        fish.item(ODItems.ELDER_GUARDIAN_ROLL.get());
        fish.item(ODItems.CABBAGE_WRAPPED_ELDER_GUARDIAN.get());
        fish.item(ODItems.FUGU_SLICE.get());
        fish.item(ODItems.FUGU_ROLL.get());
        plant.item(ODItems.BRAISED_SEA_PICKLE.get());
        //16/16 added
    }
}
