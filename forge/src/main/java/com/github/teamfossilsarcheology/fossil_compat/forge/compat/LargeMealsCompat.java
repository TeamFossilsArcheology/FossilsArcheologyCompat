package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.foundwiz.largemeals.common.registry.ModBlocks;
import net.foundwiz.largemeals.common.registry.ModItems;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class LargeMealsCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        fish.item(ModItems.PUFFERFISH_BROTH.get());
        plant.item(ModItems.RED_SOUP.get());
        plant.item(ModItems.POTATO_SOUP.get());
        fish.item(ModItems.COD_DELUXE.get());
        fish.item(ModItems.COD_SURPRISE.get());
        meat.item(ModItems.HEARTY_LUNCH.get()); //This contains meat so I count it as meat
        meat.item(ModItems.OMURICE.get()); //Same as the hearty lunch
        meat.item(ModItems.MUSHROOM_POT_PIE_SLICE.get()); //This pie has meat in it, so meat it is
        plant.item(ModItems.SWEET_BERRY_CUSTARD.get());
        meat.item(ModItems.MUSHROOM_POT_PIE.get(), getPieValue((PieBlock) ModBlocks.MUSHROOM_POT_PIE.get()));
        //11/11 added
    }
}
