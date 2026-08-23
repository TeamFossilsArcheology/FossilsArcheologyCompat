package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import club.someoneice.cofe_delight.init.ItemInit;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class CoffeeDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemInit.COFFEE_BERRIES, 1);
        plant.item(ItemInit.COFFEE_FLOUR, 1);
        plant.item(ItemInit.COFFEE_BEANS);
        plant.item(ItemInit.COFFEE_BEANS_COOKED);
        plant.item(ItemInit.COFFEE_PIE_SIDE);
        plant.item(ItemInit.COFFEE_PIE); //Not a block!
        plant.item(ItemInit.QUICHE);
        plant.item(ItemInit.WAFER);
        plant.item(ItemInit.BERRIES_WAFER);
        plant.item(ItemInit.COFFEE_WAFER);
        //10/10 added
    }
}
