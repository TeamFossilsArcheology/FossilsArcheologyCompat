package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

public class FarmersDelightCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ModItems.CABBAGE.get());
        plant.item(ModItems.TOMATO.get());
        plant.item(ModItems.ONION.get());
        plant.item(ModItems.TOMATO_SAUCE.get());
        plant.item(ModItems.WHEAT_DOUGH.get());
        plant.item(ModItems.RAW_PASTA.get());
        plant.item(ModItems.PUMPKIN_SLICE.get());
        plant.item(ModItems.CABBAGE_LEAF.get());
        plant.item(ModItems.PIE_CRUST.get());
        plant.item(ModItems.APPLE_PIE.get(), getPieValue((PieBlock) ModBlocks.APPLE_PIE.get()));
        plant.item(ModItems.SWEET_BERRY_CHEESECAKE.get(), getPieValue((PieBlock) ModBlocks.SWEET_BERRY_CHEESECAKE.get()));
        plant.item(ModItems.CHOCOLATE_PIE.get(), getPieValue((PieBlock) ModBlocks.CHOCOLATE_PIE.get()));
        plant.item(ModItems.APPLE_PIE_SLICE.get());
        plant.item(ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get());
        plant.item(ModItems.CHOCOLATE_PIE_SLICE.get());
        plant.item(ModItems.SWEET_BERRY_COOKIE.get());
        plant.item(ModItems.HONEY_COOKIE.get());
        plant.item(ModItems.MELON_POPSICLE.get());
        plant.item(ModItems.GLOW_BERRY_CUSTARD.get());
        plant.item(ModItems.FRUIT_SALAD.get());
        plant.item(ModItems.MIXED_SALAD.get());
        plant.item(ModItems.NETHER_SALAD.get());
        plant.item(ModItems.KELP_ROLL.get());
        plant.item(ModItems.KELP_ROLL_SLICE.get());
        plant.item(ModItems.COOKED_RICE.get());
        plant.item(ModItems.VEGETABLE_SOUP.get());
        plant.item(ModItems.FRIED_RICE.get());
        plant.item(ModItems.PUMPKIN_SOUP.get());
        plant.item(ModItems.MUSHROOM_RICE.get());
        plant.item(ModItems.VEGETABLE_NOODLES.get());
        plant.item(ModItems.VEGETABLE_NOODLES.get());
        plant.item(ModItems.STUFFED_PUMPKIN.get());
        plant.item(ModItems.ROAST_CHICKEN.get());
        plant.item(ModItems.ROAST_CHICKEN.get());
        plant.item(ModItems.CABBAGE_SEEDS.get(), 1);
        plant.item(ModItems.TOMATO_SEEDS.get(), 1);

        egg.item(ModItems.FRIED_EGG.get());
        egg.item(ModItems.EGG_SANDWICH.get());


        meat.item(ModItems.MINCED_BEEF.get());
        meat.item(ModItems.BEEF_PATTY.get());
        meat.item(ModItems.CHICKEN_CUTS.get());
        meat.item(ModItems.COOKED_CHICKEN_CUTS.get());
        meat.item(ModItems.BACON.get());
        meat.item(ModItems.COOKED_BACON.get());
        meat.item(ModItems.HAM.get());
        meat.item(ModItems.SMOKED_HAM.get());
        meat.item(ModItems.BARBECUE_STICK.get());
        meat.item(ModItems.CHICKEN_SANDWICH.get());
        meat.item(ModItems.HAMBURGER.get());
        meat.item(ModItems.BACON_SANDWICH.get());
        meat.item(ModItems.MUTTON_WRAP.get());
        meat.item(ModItems.DUMPLINGS.get());
        meat.item(ModItems.STUFFED_POTATO.get());
        meat.item(ModItems.BONE_BROTH.get());
        meat.item(ModItems.BEEF_STEW.get());
        meat.item(ModItems.CHICKEN_SOUP.get());
        meat.item(ModItems.NOODLE_SOUP.get());
        meat.item(ModItems.BACON_AND_EGGS.get());
        meat.item(ModItems.PASTA_WITH_MEATBALLS.get());
        meat.item(ModItems.PASTA_WITH_MUTTON_CHOP.get());
        meat.item(ModItems.CABBAGE_ROLLS.get());
        meat.item(ModItems.ROASTED_MUTTON_CHOPS.get());
        meat.item(ModItems.STEAK_AND_POTATOES.get());
        meat.item(ModItems.ROAST_CHICKEN.get());
        meat.item(ModItems.ROASTED_MUTTON_CHOPS.get());
        meat.item(ModItems.ROASTED_MUTTON_CHOPS.get());
        meat.item(ModItems.ROASTED_MUTTON_CHOPS.get());

        fish.item(ModItems.COD_SLICE.get());
        fish.item(ModItems.COOKED_COD_SLICE.get());
        fish.item(ModItems.SALMON_SLICE.get());
        fish.item(ModItems.COOKED_SALMON_SLICE.get());
        fish.item(ModItems.SALMON_ROLL.get());
        fish.item(ModItems.COD_ROLL.get());
        fish.item(ModItems.FISH_STEW.get());
        fish.item(ModItems.BAKED_COD_STEW.get());
        fish.item(ModItems.GRILLED_SALMON.get());
        fish.item(ModItems.COD_ROLL.get());
        fish.item(ModItems.COD_ROLL.get());
    }

    public static int getPieValue(PieBlock block) {
        return block.getPieSliceItem().getItem().getFoodProperties().getNutrition() * block.getMaxBites();
    }
}
