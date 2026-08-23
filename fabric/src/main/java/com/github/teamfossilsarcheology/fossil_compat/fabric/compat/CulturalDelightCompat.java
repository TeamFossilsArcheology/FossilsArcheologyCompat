package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import dev.sterner.culturaldelights.common.registry.CDObjects;

import java.util.Objects;

public class CulturalDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(CDObjects.CUCUMBER_SEEDS, 5);
        plant.item(CDObjects.CORN_KERNELS, 5);
        plant.item(CDObjects.EGGPLANT_SEEDS, 5);
        plant.item(CDObjects.AVOCADO);
        plant.item(CDObjects.CUT_AVOCADO);
        plant.item(CDObjects.CUCUMBER);
        plant.item(CDObjects.PICKLE);
        plant.item(CDObjects.CUT_CUCUMBER);
        plant.item(CDObjects.CUT_PICKLE);
        plant.item(CDObjects.EGGPLANT);
        plant.item(CDObjects.CUT_EGGPLANT);
        plant.item(CDObjects.SMOKED_EGGPLANT);
        plant.item(CDObjects.SMOKED_TOMATO);
        plant.item(CDObjects.SMOKED_CORN);
        plant.item(CDObjects.SMOKED_CUT_EGGPLANT);
        plant.item(CDObjects.SMOKED_WHITE_EGGPLANT);
        plant.item(CDObjects.WHITE_EGGPLANT);
        plant.item(CDObjects.CORN_COB);
        fish.item(CDObjects.SQUID);
        fish.item(CDObjects.COOKED_SQUID);
        fish.item(CDObjects.RAW_CALAMARI);
        fish.item(CDObjects.COOKED_CALAMARI);
        plant.item(CDObjects.POPCORN);
        plant.item(CDObjects.CORN_DOUGH);
        plant.item(CDObjects.TORTILLA);
        plant.item(CDObjects.TORTILLA_CHIPS);
        plant.item(CDObjects.ELOTE);
        plant.item(CDObjects.HEARTY_SALAD);
        meat.item(CDObjects.BEEF_BURRITO);
        meat.item(CDObjects.MUTTON_SANDWICH);
        plant.item(CDObjects.FRIED_EGGPLANT_PASTA);
        plant.item(CDObjects.EGGPLANT_BURGER); //This has no meat in it so I consider it a plant.
        plant.item(CDObjects.CREAMED_CORN);
        plant.item(CDObjects.CORN_COB);
        meat.item(CDObjects.CHICKEN_TACO);
        meat.item(CDObjects.SPICY_CURRY);
        meat.item(CDObjects.PORK_WRAP);
        fish.item(CDObjects.FISH_TACO);
        plant.item(CDObjects.MIDORI_ROLL);
        plant.item(CDObjects.MIDORI_ROLL_SLICE);
        egg.item(CDObjects.EGG_ROLL);
        meat.item(CDObjects.CHICKEN_ROLL);
        meat.item(CDObjects.CHICKEN_ROLL_SLICE);
        fish.item(CDObjects.PUFFERFISH_ROLL);
        fish.item(CDObjects.TROPICAL_ROLL);
        fish.item(CDObjects.RICE_BALL); //This has fish in it so I count it as fish
        fish.item(CDObjects.CALAMARI_ROLL);
        plant.block(CDObjects.AVOCADO_LEAVES, 20);
        plant.block(CDObjects.AVOCADO_SAPLING, 15);
        plant.item(CDObjects.AVOCADO_TOAST);
        plant.item(CDObjects.ITEMS.keySet().stream().filter(v -> Objects.equals(v.toString(), "avocado_pit")).toList().get(0), 5);
        //51/51 added! That is a lot of food!
    }
}
