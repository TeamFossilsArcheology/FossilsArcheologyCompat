package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.nethersdelight.core.registry.NDBlocks;
import com.nethersdelight.core.registry.NDItems;

public class NetherDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        meat.item(NDItems.GRILLED_STRIDER);
        meat.item(NDItems.GROUND_STRIDER);
        meat.item(NDItems.HOGLIN_EAR);
        meat.item(NDItems.HOGLIN_LOIN);
        meat.item(NDItems.HOGLIN_SIRLOIN);
        plant.block(NDBlocks.PROPELPLANT_CANE.get(), 1);
        plant.block(NDBlocks.PROPELPLANT_STEM.get(), 1);
        //meat.item(NDItems.MAGMA_GELATIN); Excluded because it doesn't make sense for it to be edible by dinos
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_HAM);
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_ROAST);
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_SNOUT);
        meat.item(NDItems.NETHER_SKEWER);
        plant.item(NDItems.PROPELPEARL);  //This seems like a plant? It grows from canes.
        meat.item(NDItems.STRIDER_MOSS_STEW);
        meat.item(NDItems.STRIDER_SLICE);
        meat.item(NDItems.WARPED_MOLDY_MEAT);
        //13/14 added, 1 excluded
    }
}
