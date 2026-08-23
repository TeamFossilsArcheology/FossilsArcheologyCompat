package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.ncpbails.alexsmobs.item.ModItems;

public class AlexDelightCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        meat.item(ModItems.RAW_BISON.get());
        meat.item(ModItems.COOKED_BISON.get());
        meat.item(ModItems.RAW_BUNFUNGUS.get());
        meat.item(ModItems.COOKED_BUNFUNGUS.get());
        meat.item(ModItems.COOKED_CENTIPEDE_LEG.get());
        meat.item(ModItems.KANGAROO_SHANK.get());
        meat.item(ModItems.COOKED_KANGAROO_SHANK.get());
        meat.item(ModItems.LOOSE_MOOSE_RIB.get());
        meat.item(ModItems.COOKED_LOOSE_MOOSE_RIB.get());
        meat.item(ModItems.BISON_MINCE.get());
        meat.item(ModItems.BISON_PATTY.get());
        meat.item(ModItems.RAW_BUNFUNGUS_DRUMSTICK.get());
        meat.item(ModItems.COOKED_BUNFUNGUS_DRUMSTICK.get());
        fish.item(ModItems.RAW_CATFISH_SLICE.get());
        fish.item(ModItems.COOKED_CATFISH_SLICE.get());
        plant.item(ModItems.GONGYLIDIA_BRUSCHETTA.get());
        meat.item(ModItems.MAGGOT_SALAD.get());
        meat.item(ModItems.KANGAROO_STEW.get());
        plant.item(ModItems.ACACIA_BLOSSOM_SOUP.get());
        fish.item(ModItems.LOBSTER_PASTA.get());
        meat.item(ModItems.BISON_BURGER.get());
        meat.item(ModItems.BUNFUNGUS_SANDWICH.get());
        meat.item(ModItems.KANGAROO_PASTA.get());
    }
}
