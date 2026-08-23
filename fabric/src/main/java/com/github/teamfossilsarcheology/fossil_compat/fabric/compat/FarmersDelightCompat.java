package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.nhoryzon.mc.farmersdelight.block.PieBlock;
import com.nhoryzon.mc.farmersdelight.registry.BlocksRegistry;
import com.nhoryzon.mc.farmersdelight.registry.ItemsRegistry;

public class FarmersDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemsRegistry.CABBAGE.get());
        plant.item(ItemsRegistry.TOMATO.get());
        plant.item(ItemsRegistry.ONION.get());
        plant.item(ItemsRegistry.TOMATO_SAUCE.get());
        plant.item(ItemsRegistry.WHEAT_DOUGH.get());
        plant.item(ItemsRegistry.RAW_PASTA.get());
        plant.item(ItemsRegistry.PUMPKIN_SLICE.get());
        plant.item(ItemsRegistry.CABBAGE_LEAF.get());
        plant.item(ItemsRegistry.PIE_CRUST.get());
        plant.item(ItemsRegistry.APPLE_PIE.get(), getPieValue((PieBlock) BlocksRegistry.APPLE_PIE.get()));
        plant.item(ItemsRegistry.SWEET_BERRY_CHEESECAKE.get(), getPieValue((PieBlock) BlocksRegistry.SWEET_BERRY_CHEESECAKE.get()));
        plant.item(ItemsRegistry.CHOCOLATE_PIE.get(), getPieValue((PieBlock) BlocksRegistry.CHOCOLATE_PIE.get()));
        plant.item(ItemsRegistry.APPLE_PIE_SLICE.get());
        plant.item(ItemsRegistry.SWEET_BERRY_CHEESECAKE_SLICE.get());
        plant.item(ItemsRegistry.CHOCOLATE_PIE_SLICE.get());
        plant.item(ItemsRegistry.SWEET_BERRY_COOKIE.get());
        plant.item(ItemsRegistry.HONEY_COOKIE.get());
        plant.item(ItemsRegistry.MELON_POPSICLE.get());
        plant.item(ItemsRegistry.GLOW_BERRY_CUSTARD.get());
        plant.item(ItemsRegistry.FRUIT_SALAD.get());
        plant.item(ItemsRegistry.MIXED_SALAD.get());
        plant.item(ItemsRegistry.NETHER_SALAD.get());
        plant.item(ItemsRegistry.KELP_ROLL.get());
        plant.item(ItemsRegistry.KELP_ROLL_SLICE.get());
        plant.item(ItemsRegistry.COOKED_RICE.get());
        plant.item(ItemsRegistry.VEGETABLE_SOUP.get());
        plant.item(ItemsRegistry.FRIED_RICE.get());
        plant.item(ItemsRegistry.PUMPKIN_SOUP.get());
        plant.item(ItemsRegistry.MUSHROOM_RICE.get());
        plant.item(ItemsRegistry.VEGETABLE_NOODLES.get());
        plant.item(ItemsRegistry.VEGETABLE_NOODLES.get());
        plant.item(ItemsRegistry.STUFFED_PUMPKIN.get());
        plant.item(ItemsRegistry.ROAST_CHICKEN.get());
        plant.item(ItemsRegistry.ROAST_CHICKEN.get());
        plant.item(ItemsRegistry.CABBAGE_SEEDS.get(), 5);
        plant.item(ItemsRegistry.TOMATO_SEEDS.get(), 5);

        egg.item(ItemsRegistry.FRIED_EGG.get());
        egg.item(ItemsRegistry.EGG_SANDWICH.get());


        meat.item(ItemsRegistry.MINCED_BEEF.get());
        meat.item(ItemsRegistry.BEEF_PATTY.get());
        meat.item(ItemsRegistry.CHICKEN_CUTS.get());
        meat.item(ItemsRegistry.COOKED_CHICKEN_CUTS.get());
        meat.item(ItemsRegistry.BACON.get());
        meat.item(ItemsRegistry.COOKED_BACON.get());
        meat.item(ItemsRegistry.HAM.get());
        meat.item(ItemsRegistry.SMOKED_HAM.get());
        meat.item(ItemsRegistry.BARBECUE_STICK.get());
        meat.item(ItemsRegistry.CHICKEN_SANDWICH.get());
        meat.item(ItemsRegistry.HAMBURGER.get());
        meat.item(ItemsRegistry.BACON_SANDWICH.get());
        meat.item(ItemsRegistry.MUTTON_WRAP.get());
        meat.item(ItemsRegistry.DUMPLINGS.get());
        meat.item(ItemsRegistry.STUFFED_POTATO.get());
        meat.item(ItemsRegistry.BONE_BROTH.get());
        meat.item(ItemsRegistry.BEEF_STEW.get());
        meat.item(ItemsRegistry.CHICKEN_SOUP.get());
        meat.item(ItemsRegistry.NOODLE_SOUP.get());
        meat.item(ItemsRegistry.BACON_AND_EGGS.get());
        meat.item(ItemsRegistry.PASTA_WITH_MEATBALLS.get());
        meat.item(ItemsRegistry.PASTA_WITH_MUTTON_CHOP.get());
        meat.item(ItemsRegistry.CABBAGE_ROLLS.get());
        meat.item(ItemsRegistry.ROASTED_MUTTON_CHOPS.get());
        meat.item(ItemsRegistry.STEAK_AND_POTATOES.get());
        meat.item(ItemsRegistry.ROAST_CHICKEN.get());
        meat.item(ItemsRegistry.ROASTED_MUTTON_CHOPS.get());
        meat.item(ItemsRegistry.ROASTED_MUTTON_CHOPS.get());
        meat.item(ItemsRegistry.ROASTED_MUTTON_CHOPS.get());

        fish.item(ItemsRegistry.COD_SLICE.get());
        fish.item(ItemsRegistry.COOKED_COD_SLICE.get());
        fish.item(ItemsRegistry.SALMON_SLICE.get());
        fish.item(ItemsRegistry.COOKED_SALMON_SLICE.get());
        fish.item(ItemsRegistry.SALMON_ROLL.get());
        fish.item(ItemsRegistry.COD_ROLL.get());
        fish.item(ItemsRegistry.FISH_STEW.get());
        fish.item(ItemsRegistry.BAKED_COD_STEW.get());
        fish.item(ItemsRegistry.GRILLED_SALMON.get());
        fish.item(ItemsRegistry.COD_ROLL.get());
        fish.item(ItemsRegistry.COD_ROLL.get());
    }

    public static int getPieValue(PieBlock block) {
        return block.pieSlice.getFoodProperties().getNutrition() * PieBlock.MAX_BITES * 5;
    }
}
