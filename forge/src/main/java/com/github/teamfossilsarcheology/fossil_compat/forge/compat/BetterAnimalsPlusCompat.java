package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import dev.itsmeow.betteranimalsplus.init.ModEntities;
import dev.itsmeow.betteranimalsplus.init.ModItems;

public class BetterAnimalsPlusCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        var egg = provider.type(FoodType.EGG);
        meat.entity(ModEntities.LAMMERGEIER.getEntityType(), 8);
        meat.entity(ModEntities.TARANTULA.getEntityType());
        meat.entity(ModEntities.PHEASANT.getEntityType(), 10);
        meat.entity(ModEntities.SQUIRREL.getEntityType(), 3);
        meat.entity(ModEntities.SONGBIRD.getEntityType(), 3);
        meat.entity(ModEntities.BADGER.getEntityType(), 8);
        fish.entity(ModEntities.CRAB.getEntityType(), 5);
        fish.entity(ModEntities.HORSESHOE_CRAB.getEntityType(), 7);
        fish.entity(ModEntities.SHARK.getEntityType(), 40);
        meat.entity(ModEntities.TURKEY.getEntityType(), 10);
        meat.entity(ModEntities.GOOSE.getEntityType(), 10);
        fish.entity(ModEntities.WHALE.getEntityType(), 60);
        meat.entity(ModEntities.WALRUS.getEntityType(), 30);
        fish.entity(ModEntities.SQUID_COLOSSAL.getEntityType(), 40);
        fish.entity(ModEntities.SQUID_GIANT.getEntityType(), 40);
        fish.entity(ModEntities.OCTOPUS.getEntityType(), 25);
        meat.entity(ModEntities.BROWN_BEAR.getEntityType(), 40);
        meat.entity(ModEntities.BLACK_BEAR.getEntityType(), 40);
        meat.entity(ModEntities.DEER.getEntityType(), 35);
        meat.entity(ModEntities.FERAL_WOLF.getEntityType(), 15);
        meat.entity(ModEntities.COYOTE.getEntityType(), 15);
        fish.entity(ModEntities.JELLYFISH.getEntityType(), 8);
        meat.entity(ModEntities.REINDEER.getEntityType(), 35);
        meat.entity(ModEntities.BOAR.getEntityType(), 30);
        fish.entity(ModEntities.LAMPREY.getEntityType(), 5);
        fish.entity(ModEntities.NAUTILUS.getEntityType(), 10);
        meat.entity(ModEntities.MOOSE.getEntityType(), 45);
        fish.entity(ModEntities.EEL_FRESHWATER.getEntityType(), 20);
        fish.entity(ModEntities.EEL_SALTWATER.getEntityType(), 20);
        fish.entity(ModEntities.BARRACUDA.getEntityType(), 15);
        fish.entity(ModEntities.FLYING_FISH.getEntityType(), 5);

        meat.item(ModItems.PHEASANT_RAW.get());
        meat.item(ModItems.PHEASANT_COOKED.get());
        fish.item(ModItems.CRAB_MEAT_RAW.get());
        fish.item(ModItems.CRAB_MEAT_COOKED.get());
        egg.item(ModItems.PHEASANT_EGG.get(), 1);
        egg.item(ModItems.TURKEY_EGG.get(), 1);
        egg.item(ModItems.GOOSE_EGG.get(), 2);
        egg.item(ModItems.GOLDEN_GOOSE_EGG.get(), 3);
        meat.item(ModItems.TURKEY_LEG_RAW.get());
        meat.item(ModItems.TURKEY_LEG_COOKED.get());
        fish.item(ModItems.EEL_MEAT_RAW.get());
        fish.item(ModItems.EEL_MEAT_COOKED.get());
        egg.item(ModItems.FRIED_EGG.get());
        fish.item(ModItems.CALAMARI_RAW.get());
        fish.item(ModItems.CALAMARI_COOKED.get());
        meat.item(ModItems.TURKEY_RAW.get());
        meat.item(ModItems.TURKEY_COOKED.get());
    }
}
