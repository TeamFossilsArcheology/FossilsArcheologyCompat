package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import cn.mcmod.corn_delight.item.ItemRegistry;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class CornDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemRegistry.BOILED_CORN.get());
        plant.item(ItemRegistry.CARAMEL_POPCORN.get());
        meat.item(ItemRegistry.CLASSIC_CORN_DOG.get());
        plant.item(ItemRegistry.CORN.get());
        meat.item(ItemRegistry.CORN_DOG.get());
        plant.item(ItemRegistry.CORN_SEEDS.get(), 5);
        plant.item(ItemRegistry.CORN_SOUP.get());
        plant.item(ItemRegistry.CORNBREAD.get());
        plant.item(ItemRegistry.CORNBREAD_BATTER.get());
        plant.item(ItemRegistry.CORNBREAD_STUFFING.get());
        plant.item(ItemRegistry.CREAMED_CORN.get());
        plant.item(ItemRegistry.GRILLED_CORN.get());
        meat.item(ItemRegistry.NACHOS.get()); //The recipe has meat in it
        plant.item(ItemRegistry.POPCORN.get()); //This is made from seeds so it is okay for it to be eaten by dinos
        plant.item(ItemRegistry.RAW_TORTILLA.get());
        meat.item(ItemRegistry.TACO.get());
        plant.item(ItemRegistry.TORTILLA.get());
        plant.item(ItemRegistry.TORTILLA_CHIP.get());
        //18/18 added
    }
}
