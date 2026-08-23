package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.sammy.minersdelight.setup.MDItems;

public class MinersDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(MDItems.BAKED_CAVE_CARROT.get());
        fish.item(MDItems.BAKED_SQUID.get());
        fish.item(MDItems.BAKED_TENTACLES.get());
        meat.item(MDItems.BAT_WING.get());
        plant.item(MDItems.BEETROOT_SOUP_CUP.get());
        fish.item(MDItems.BOWL_OF_STUFFED_SQUID.get()); //Has squid so fish
        plant.item(MDItems.CAVE_CARROT.get());
        plant.item(MDItems.CAVE_SOUP.get());
        fish.item(MDItems.GLOW_SQUID.get());
        //plant.item(MDItems.HOT_COCOA_CUP.get()); Excluded because the normal cocoa cup is excluded too
        meat.item(MDItems.IMPROVISED_BARBECUE_STICK.get()); //Has bat wings so meat
        plant.item(MDItems.MUSHROOM_STEW_CUP.get());
        plant.item(MDItems.PASTA_WITH_VEGGIEBALLS.get());
        meat.item(MDItems.RABBIT_STEW_CUP.get());
        egg.item(MDItems.SILVERFISH_EGGS.get());
        meat.item(MDItems.SMOKED_BAT_WING.get());
        fish.item(MDItems.SQUID.get());
        fish.item(MDItems.TENTACLES.get());
        fish.item(MDItems.WEIRD_CAVIAR.get());
        fish.item(MDItems.BAKED_COD_STEW_CUP.get());
        meat.item(MDItems.NOODLE_SOUP_CUP.get()); //This has meat in it so it is a meat
        meat.item(MDItems.BEEF_STEW_CUP.get());
        meat.item(MDItems.CHICKEN_SOUP_CUP.get());
        fish.item(MDItems.FISH_STEW_CUP.get());
        meat.item(MDItems.PUMPKIN_SOUP_CUP.get()); //This has meat in it so it is a meat
        plant.item(MDItems.VEGETABLE_SOUP_CUP.get());
        //25/26, 1 excluded
    }
}
