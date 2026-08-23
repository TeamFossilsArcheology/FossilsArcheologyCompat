package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import club.someoneice.cofe_delight.init.ItemInit;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class CoffeeDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemInit.COFFEE_BERRIES.get(), 5);
        plant.item(ItemInit.COFFEE_FLOUR.get(), 15);
        plant.item(ItemInit.COFFEE_BEANS.get());
        plant.item(ItemInit.COFFEE_BEANS_COOKED.get());
        plant.item(ItemInit.COFFEE_PIE_SIDE.get());
        plant.item(ItemInit.COFFEE_PIE.get()); //Not a block!
        plant.item(ItemInit.QUICHE.get());
        plant.item(ItemInit.WAFER.get());
        plant.item(ItemInit.BERRIES_WAFER.get());
        plant.item(ItemInit.COFFEE_WAFER.get());
        //10/10 added
    }
}
