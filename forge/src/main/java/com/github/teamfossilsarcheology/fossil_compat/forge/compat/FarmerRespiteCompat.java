package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.farmersrespite.core.registry.FRBlocks;
import com.farmersrespite.core.registry.FRItems;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class FarmerRespiteCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.block(FRBlocks.WILD_TEA_BUSH.get(), 20);
        plant.item(FRItems.TEA_SEEDS.get(), 5);
        plant.item(FRItems.GREEN_TEA_LEAVES.get(), 5);
        plant.item(FRItems.YELLOW_TEA_LEAVES.get(), 5);
        plant.item(FRItems.BLACK_TEA_LEAVES.get(), 5);
        plant.item(FRItems.COFFEE_BERRIES.get());
        plant.item(FRItems.ROSE_HIPS.get(), 5);
        plant.item(FRItems.GREEN_TEA_COOKIE.get());
        plant.item(FRItems.NETHER_WART_SOURDOUGH.get());
        fish.item(FRItems.BLACK_COD.get());
        plant.item(FRItems.TEA_CURRY.get());
        meat.item(FRItems.BLAZING_CHILI.get());
        plant.item(FRItems.COFFEE_CAKE.get(), 7 * 7 * 3);
        plant.item(FRItems.COFFEE_CAKE_SLICE.get());
        plant.item(FRItems.ROSE_HIP_PIE_SLICE.get());
        plant.item(FRItems.ROSE_HIP_PIE.get(), getPieValue((PieBlock) FRBlocks.ROSE_HIP_PIE.get()));
    }
}
