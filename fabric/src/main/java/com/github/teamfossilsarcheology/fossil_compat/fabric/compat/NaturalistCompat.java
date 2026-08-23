package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.starfish_studios.naturalist.registry.NaturalistEntityTypes;
import com.starfish_studios.naturalist.registry.NaturalistItems;

public class NaturalistCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);

        meat.entity(NaturalistEntityTypes.BEAR.get(), 35);
        meat.entity(NaturalistEntityTypes.SNAKE.get(), 10);
        meat.entity(NaturalistEntityTypes.CORAL_SNAKE.get(), 10);
        meat.entity(NaturalistEntityTypes.RATTLESNAKE.get(), 10);
        meat.entity(NaturalistEntityTypes.DEER.get(), 40);
        meat.entity(NaturalistEntityTypes.BLUEJAY.get(), 5);
        meat.entity(NaturalistEntityTypes.CANARY.get(), 5);
        meat.entity(NaturalistEntityTypes.CARDINAL.get(), 5);
        meat.entity(NaturalistEntityTypes.ROBIN.get(), 5);
        meat.entity(NaturalistEntityTypes.RHINO.get(), 60);
        meat.entity(NaturalistEntityTypes.LION.get(), 40);
        meat.entity(NaturalistEntityTypes.ELEPHANT.get(), 80);
        meat.entity(NaturalistEntityTypes.ZEBRA.get(), 40);
        meat.entity(NaturalistEntityTypes.GIRAFFE.get(), 50);
        meat.entity(NaturalistEntityTypes.HIPPO.get(), 80);
        meat.entity(NaturalistEntityTypes.VULTURE.get(), 15);
        meat.entity(NaturalistEntityTypes.BOAR.get(), 10);

        meat.item(NaturalistItems.VENISON.get());
        meat.item(NaturalistItems.COOKED_VENISON.get());
    }
}
