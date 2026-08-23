package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.pavocado.exoticbirds.init.ExoticBirdsEntities;
import net.pavocado.exoticbirds.init.ExoticBirdsItems;

public class ExoticBirdsCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        var egg = provider.type(FoodType.EGG);
        meat.entity(ExoticBirdsEntities.BLUEJAY.get(), 3);
        meat.entity(ExoticBirdsEntities.BOOBY.get(), 7);
        meat.entity(ExoticBirdsEntities.BUDGERIGAR.get(), 3);
        meat.entity(ExoticBirdsEntities.CARDINAL.get(), 3);
        meat.entity(ExoticBirdsEntities.CASSOWARY.get(), 25);
        meat.entity(ExoticBirdsEntities.COCKATOO.get(), 5);
        meat.entity(ExoticBirdsEntities.CRANE.get(), 15);
        meat.entity(ExoticBirdsEntities.DUCK.get(), 10);
        meat.entity(ExoticBirdsEntities.FLAMINGO.get(), 7);
        meat.entity(ExoticBirdsEntities.GOULDIANFINCH.get(), 3);
        meat.entity(ExoticBirdsEntities.GULL.get(), 5);
        meat.entity(ExoticBirdsEntities.HERON.get(), 15);
        meat.entity(ExoticBirdsEntities.HUMMINGBIRD.get(), 3);
        meat.entity(ExoticBirdsEntities.KINGFISHER.get(), 5);
        meat.entity(ExoticBirdsEntities.KIWI.get(), 3);
        meat.entity(ExoticBirdsEntities.KOOKABURRA.get(), 5);
        meat.entity(ExoticBirdsEntities.LYREBIRD.get(), 3);
        meat.entity(ExoticBirdsEntities.MACAW.get(), 5);
        meat.entity(ExoticBirdsEntities.MAGPIE.get(), 3);
        meat.entity(ExoticBirdsEntities.OSTRICH.get(), 27);
        meat.entity(ExoticBirdsEntities.OWL.get(), 7);
        meat.entity(ExoticBirdsEntities.PEAFOWL.get(), 10);
        meat.entity(ExoticBirdsEntities.PELICAN.get(), 5);
        meat.entity(ExoticBirdsEntities.PENGUIN.get(), 7);
        meat.entity(ExoticBirdsEntities.PIGEON.get(), 3);
        meat.entity(ExoticBirdsEntities.ROADRUNNER.get(), 5);
        meat.entity(ExoticBirdsEntities.ROBIN.get(), 3);
        meat.entity(ExoticBirdsEntities.SWAN.get(), 12);
        meat.entity(ExoticBirdsEntities.TOUCAN.get(), 7);
        meat.entity(ExoticBirdsEntities.WOODPECKER.get(), 3);

        meat.item(ExoticBirdsItems.RAW_BIRDMEAT.get());
        meat.item(ExoticBirdsItems.COOKED_BIRDMEAT.get());
        egg.item(ExoticBirdsItems.BLUEJAY_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.BOOBY_EGG.get(), 1);
        egg.item(ExoticBirdsItems.BUDGERIGAR_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.CARDINAL_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.CASSOWARY_EGG.get(), 3);
        egg.item(ExoticBirdsItems.COCKATOO_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.CRANE_EGG.get(), 2);
        egg.item(ExoticBirdsItems.DUCK_EGG.get(), 2, 5);
        egg.item(ExoticBirdsItems.FLAMINGO_EGG.get(), 1);
        egg.item(ExoticBirdsItems.GOULDIANFINCH_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.GULL_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.HERON_EGG.get(), 2);
        egg.item(ExoticBirdsItems.HUMMINGBIRD_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.KINGFISHER_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.KIWI_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.KOOKABURRA_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.LYREBIRD_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.MACAW_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.MAGPIE_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.OSTRICH_EGG.get(), 3);
        egg.item(ExoticBirdsItems.OWL_EGG.get(), 1);
        egg.item(ExoticBirdsItems.PEAFOWL_EGG.get(), 1);
        egg.item(ExoticBirdsItems.PELICAN_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.PENGUIN_EGG.get(), 1);
        egg.item(ExoticBirdsItems.PIGEON_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.ROADRUNNER_EGG.get(), 1, 5);
        egg.item(ExoticBirdsItems.ROBIN_EGG.get(), 1, 3);
        egg.item(ExoticBirdsItems.SWAN_EGG.get(), 2, 5);
        egg.item(ExoticBirdsItems.TOUCAN_EGG.get(), 1);
        egg.item(ExoticBirdsItems.WOODPECKER_EGG.get(), 1, 3);
    }
}
