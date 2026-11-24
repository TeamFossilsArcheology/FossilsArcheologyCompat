package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.alexthe666.alexsmobs.entity.AMEntityRegistry;
import com.github.alexthe666.alexsmobs.item.AMItemRegistry;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;

public class AlexMobsCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        meat.item(AMItemRegistry.MAGGOT.get());
        meat.item(AMItemRegistry.MOOSE_RIBS.get());
        meat.item(AMItemRegistry.COOKED_MOOSE_RIBS.get());
        meat.item(AMItemRegistry.KANGAROO_MEAT.get());
        meat.item(AMItemRegistry.COOKED_KANGAROO_MEAT.get());

        fish.item(AMItemRegistry.LOBSTER_TAIL.get());
        fish.item(AMItemRegistry.COOKED_LOBSTER_TAIL.get());
        fish.item(AMItemRegistry.BLOBFISH.get());
        fish.item(AMItemRegistry.COSMIC_COD.get());
        fish.item(AMItemRegistry.RAINBOW_JELLY.get());
        fish.item(AMItemRegistry.RAW_CATFISH.get());
        fish.item(AMItemRegistry.COOKED_CATFISH.get());
        fish.item(AMItemRegistry.FLYING_FISH.get());

        plant.item(AMItemRegistry.BANANA.get());

        meat.entity(AMEntityRegistry.ANTEATER.get(), 10);
        meat.entity(AMEntityRegistry.BALD_EAGLE.get(), 8);
        meat.entity(AMEntityRegistry.BISON.get(), 20);
        meat.entity(AMEntityRegistry.CAPUCHIN_MONKEY.get(), 5);
        meat.entity(AMEntityRegistry.CROW.get(), 4);
        meat.entity(AMEntityRegistry.DROPBEAR.get(), 11);
        meat.entity(AMEntityRegistry.ELEPHANT.get(), 33);
        meat.entity(AMEntityRegistry.EMU.get(), 10);
        meat.entity(AMEntityRegistry.GAZELLE.get(), 4);
        meat.entity(AMEntityRegistry.GELADA_MONKEY.get(), 9);
        meat.entity(AMEntityRegistry.GORILLA.get(), 25);
        meat.entity(AMEntityRegistry.GRIZZLY_BEAR.get(), 28);
        meat.entity(AMEntityRegistry.HUMMINGBIRD.get(), 2);
        meat.entity(AMEntityRegistry.JERBOA.get(), 2);
        meat.entity(AMEntityRegistry.KANGAROO.get(), 11);
        meat.entity(AMEntityRegistry.KOMODO_DRAGON.get(), 15);
        meat.entity(AMEntityRegistry.MANED_WOLF.get(), 8);
        meat.entity(AMEntityRegistry.MOOSE.get(), 28);
        meat.entity(AMEntityRegistry.RACCOON.get(), 5);
        meat.entity(AMEntityRegistry.RATTLESNAKE.get(), 4);
        meat.entity(AMEntityRegistry.ROADRUNNER.get(), 4);
        meat.entity(AMEntityRegistry.SEAGULL.get(), 4);
        meat.entity(AMEntityRegistry.SHOEBILL.get(), 5);
        meat.entity(AMEntityRegistry.SNOW_LEOPARD.get(), 15);
        meat.entity(AMEntityRegistry.SUNBIRD.get(), 10);
        meat.entity(AMEntityRegistry.TASMANIAN_DEVIL.get(), 7);
        meat.entity(AMEntityRegistry.TIGER.get(), 25);
        meat.entity(AMEntityRegistry.TOUCAN.get(), 3);
        meat.entity(AMEntityRegistry.TUSKLIN.get(), 20);
        meat.entity(AMEntityRegistry.PLATYPUS.get(), 5);
        meat.entity(AMEntityRegistry.COSMAW.get(), 10);
        meat.entity(AMEntityRegistry.WARPED_TOAD.get(), 15);
        meat.entity(AMEntityRegistry.ENDERGRADE.get(), 10);
        meat.entity(AMEntityRegistry.MUNGUS.get(), 8);
        meat.entity(AMEntityRegistry.BUNFUNGUS.get(), 40);
        meat.entity(AMEntityRegistry.FROSTSTALKER.get(), 12);

        fish.entity(AMEntityRegistry.ALLIGATOR_SNAPPING_TURTLE.get(), 9);
        fish.entity(AMEntityRegistry.BLOBFISH.get(), 4);
        fish.entity(AMEntityRegistry.CACHALOT_WHALE.get(), 80);
        fish.entity(AMEntityRegistry.CATFISH.get(), 5);
        fish.entity(AMEntityRegistry.COMB_JELLY.get(), 3);
        fish.entity(AMEntityRegistry.COSMIC_COD.get(), 2);
        fish.entity(AMEntityRegistry.DEVILS_HOLE_PUPFISH.get(), 1);
        fish.entity(AMEntityRegistry.FLYING_FISH.get(), 3);
        fish.entity(AMEntityRegistry.FRILLED_SHARK.get(), 10);
        fish.entity(AMEntityRegistry.GIANT_SQUID.get(), 19);
        fish.entity(AMEntityRegistry.HAMMERHEAD_SHARK.get(), 15);
        fish.entity(AMEntityRegistry.LOBSTER.get(), 3);
        fish.entity(AMEntityRegistry.MANTIS_SHRIMP.get(), 10);
        fish.entity(AMEntityRegistry.MIMIC_OCTOPUS.get(), 8);
        fish.entity(AMEntityRegistry.ORCA.get(), 30);
        fish.entity(AMEntityRegistry.SEA_BEAR.get(), 100);
        fish.entity(AMEntityRegistry.SEAL.get(), 5);
        fish.entity(AMEntityRegistry.TERRAPIN.get(), 7);
        fish.entity(AMEntityRegistry.ANACONDA.get(), 5);
        fish.entity(AMEntityRegistry.CROCODILE.get(), 15);

        meat.entity(AMEntityRegistry.COCKROACH.get(), 9);
        meat.entity(AMEntityRegistry.CRIMSON_MOSQUITO.get(), 5);
        meat.entity(AMEntityRegistry.CENTIPEDE_HEAD.get(), 18);
        meat.entity(AMEntityRegistry.TARANTULA_HAWK.get(), 9);
        meat.entity(AMEntityRegistry.WARPED_MOSCO.get(), 50);
    }
}
