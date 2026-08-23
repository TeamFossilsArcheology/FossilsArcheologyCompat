package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.ncpbails.culturaldelights.block.ModBlocks;
import com.ncpbails.culturaldelights.item.ModItems;

import java.util.Objects;

public class CulturalDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ModItems.CUCUMBER_SEEDS.get(), 1);
        plant.item(ModItems.CORN_KERNELS.get(), 1);
        plant.item(ModItems.EGGPLANT_SEEDS.get(), 1);
        plant.item(ModItems.AVOCADO.get());
        plant.item(ModItems.CUT_AVOCADO.get());
        plant.item(ModItems.CUCUMBER.get());
        plant.item(ModItems.PICKLE.get());
        plant.item(ModItems.CUT_CUCUMBER.get());
        plant.item(ModItems.CUT_PICKLE.get());
        plant.item(ModItems.EGGPLANT.get());
        plant.item(ModItems.CUT_EGGPLANT.get());
        plant.item(ModItems.SMOKED_EGGPLANT.get());
        plant.item(ModItems.SMOKED_TOMATO.get());
        plant.item(ModItems.SMOKED_CORN.get());
        plant.item(ModItems.SMOKED_CUT_EGGPLANT.get());
        plant.item(ModItems.SMOKED_WHITE_EGGPLANT.get());
        plant.item(ModItems.WHITE_EGGPLANT.get());
        plant.item(ModItems.CORN_COB.get());
        fish.item(ModItems.SQUID.get());
        fish.item(ModItems.COOKED_SQUID.get());
        fish.item(ModItems.RAW_CALAMARI.get());
        fish.item(ModItems.COOKED_CALAMARI.get());
        plant.item(ModItems.POPCORN.get());
        plant.item(ModItems.CORN_DOUGH.get());
        plant.item(ModItems.TORTILLA.get());
        plant.item(ModItems.TORTILLA_CHIPS.get());
        plant.item(ModItems.ELOTE.get());
        plant.item(ModItems.HEARTY_SALAD.get());
        meat.item(ModItems.BEEF_BURRITO.get());
        meat.item(ModItems.MUTTON_SANDWICH.get());
        plant.item(ModItems.FRIED_EGGPLANT_PASTA.get());
        plant.item(ModItems.EGGPLANT_BURGER.get()); //This has no meat in it so I consider it a plant.
        plant.item(ModItems.CREAMED_CORN.get());
        plant.item(ModItems.CORN_COB.get());
        meat.item(ModItems.CHICKEN_TACO.get());
        meat.item(ModItems.SPICY_CURRY.get());
        meat.item(ModItems.PORK_WRAP.get());
        fish.item(ModItems.FISH_TACO.get());
        plant.item(ModItems.MIDORI_ROLL.get());
        plant.item(ModItems.MIDORI_ROLL_SLICE.get());
        egg.item(ModItems.EGG_ROLL.get());
        meat.item(ModItems.CHICKEN_ROLL.get());
        meat.item(ModItems.CHICKEN_ROLL_SLICE.get());
        fish.item(ModItems.PUFFERFISH_ROLL.get());
        fish.item(ModItems.TROPICAL_ROLL.get());
        fish.item(ModItems.RICE_BALL.get()); //This has fish in it so I count it as fish
        fish.item(ModItems.CALAMARI_ROLL.get());
        plant.block(ModBlocks.AVOCADO_LEAVES.get(), 4);
        plant.block(ModBlocks.AVOCADO_SAPLING.get(), 3);
        plant.item(ModItems.AVOCADO_TOAST.get());
        //50/50 added! That is a lot of food!
    }
}
