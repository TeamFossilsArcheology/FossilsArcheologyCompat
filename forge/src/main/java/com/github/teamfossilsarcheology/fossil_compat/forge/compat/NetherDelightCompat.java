package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

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
        meat.item(NDItems.GRILLED_STRIDER.get());
        meat.item(NDItems.GROUND_STRIDER.get());
        meat.item(NDItems.HOGLIN_EAR.get());
        meat.item(NDItems.HOGLIN_LOIN.get());
        meat.item(NDItems.HOGLIN_SIRLOIN.get());
        plant.block(NDBlocks.PROPELPLANT_CANE.get(), 1);
        plant.block(NDBlocks.PROPELPLANT_STEM.get(), 1);
        //meat.item(NDItems.MAGMA_GELATIN.get()); Excluded because it doesn't make sense for it to be edible by dinos
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_HAM.get());
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_ROAST.get());
        meat.item(NDItems.PLATE_OF_STUFFED_HOGLIN_SNOUT.get());
        meat.item(NDItems.NETHER_SKEWER.get());
        plant.item(NDItems.PROPELPEARL.get());  //This seems like a plant? It grows from canes.
        meat.item(NDItems.STRIDER_MOSS_STEW.get());
        meat.item(NDItems.STRIDER_SLICE.get());
        meat.item(NDItems.WARPED_MOLDY_MEAT.get());
        //13/14 added, 1 excluded
    }
}
