package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import club.someoneice.pineapple.init.BlockList;
import club.someoneice.pineapple.init.ItemList;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class PineappleDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemList.PINEAPPLE.get());
        plant.item(ItemList.PINEAPPLE_SIDE.get());
        plant.item(ItemList.PINEAPPLE_PIE_SIDE.get());
        plant.item(ItemList.PINEAPPLE_FRIED_RICE.get());
        plant.item(ItemList.PINEAPPLE_CAKE_SLICE.get());

        plant.block(BlockList.PINEAPPLE_PIE.get(), getPieValue((PieBlock) BlockList.PINEAPPLE_PIE.get()));
        plant.block(BlockList.PINEAPPLE_CAKE.get(), 7 * 2);
        plant.block(BlockList.PINEAPPLE_WILD_CROP.get(), 3);
        plant.block(BlockList.PINEAPPLE_CROP.get(), 3);
    }
}
