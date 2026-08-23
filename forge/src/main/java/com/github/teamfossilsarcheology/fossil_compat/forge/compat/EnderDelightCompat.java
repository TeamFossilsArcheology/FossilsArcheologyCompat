package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.axedgaming.endersdelight.item.ModItems;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class EnderDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ModItems.CHORUS_STEW.get());
        plant.item(ModItems.CHORUS_STEW_WOOD.get());
        meat.item(ModItems.CRAWLING_SANDWICH.get());
        meat.item(ModItems.ENDER_PAELLA.get()); //This has meat in it so I will count it as meat
        meat.item(ModItems.ENDER_PAELLA_WOOD.get());
        meat.item(ModItems.ENDERMITE_STEW.get());
        meat.item(ModItems.ENDERMITE_STEW_WOOD.get());
        plant.item(ModItems.PEARL_PASTA.get()); //This is pasta so I will count it as a plant
        plant.item(ModItems.PEARL_PASTA_WOOD.get());
        plant.item(ModItems.STRANGE_ECLAIR.get()); //This is made of wheat, sugar and eye of ender so I will count it as a plant
        plant.item(ModItems.STUFFED_SHULKER_BOWL.get());
        plant.item(ModItems.TWISTED_CEREAL.get()); //This is made of ender sight, ender eyes, chorus fruit and milk, I will add it as a plant because ender sight/ender eyes isn't really "meat"
        plant.item(ModItems.TWISTED_CEREAL_WOOD.get());
        meat.item(ModItems.UNCANNY_COOKIES.get()); //Has endermite skin in it, I will count that as meat.
        meat.item(ModItems.CRISPY_SKEWER.get());
        plant.item(ModItems.CHORUS_PIE_SLICE.get());
        plant.item(ModItems.CHORUS_PIE.get(), getPieValue((PieBlock) com.axedgaming.endersdelight.block.ModBlocks.CHORUS_PIE.get()));
        //18/21 added, Excluded 3 items because they cause nausea.
    }
}
