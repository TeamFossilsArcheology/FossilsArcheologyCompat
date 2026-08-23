package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.mcreator.italiandelight.init.ItalianDelightModItems;

public class ItalianDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItalianDelightModItems.PIZZA_MARGHERITA_SLICE.get()); //Normally I wouldn't count pizzas as they contain cheese, but this mod is basically mostly pizzas, so I will make an exception
        plant.item(ItalianDelightModItems.PIZZA_DIAVOLA_SLICE.get());
        plant.item(ItalianDelightModItems.GRAPE_SEEDS.get(), 1);
        plant.item(ItalianDelightModItems.GRAPE_BUNCH.get());
        meat.item(ItalianDelightModItems.SALAMI.get());
        meat.item(ItalianDelightModItems.SALAMI_PIECES.get());
        meat.item(ItalianDelightModItems.WINE_SALAMI.get());
        plant.item(ItalianDelightModItems.MUSHROOM_PIZZA_SLICE.get());
        meat.item(ItalianDelightModItems.PIZZA_PROSCIUTTO_SLICE.get()); //Ham Pizza Slice
        plant.item(ItalianDelightModItems.MUSHROOM_RISOTTO.get());
        plant.item(ItalianDelightModItems.RISOTTO_AL_SUGO.get());
        plant.item(ItalianDelightModItems.DANTES_SPECIAL_SLICE.get());
        plant.item(ItalianDelightModItems.BERRIEDDELIGHT.get());
        plant.item(ItalianDelightModItems.PANDORO_DOUGH.get(), 8); //8 slices of one food point
        plant.item(ItalianDelightModItems.PANDORO.get(), 3 * 8);
        plant.item(ItalianDelightModItems.PANDORO_SLICE.get());
        plant.item(ItalianDelightModItems.PASTA_AL_PESTO.get());
        plant.item(ItalianDelightModItems.TOMATO_PASTA.get()); //This mod is making me especially hungry
        plant.item(ItalianDelightModItems.PANETTONE.get(), 3 * 8);
        plant.item(ItalianDelightModItems.PANETTONE_SLICE.get());
        plant.item(ItalianDelightModItems.TIRAMISU.get());
        plant.item(ItalianDelightModItems.MOZZARELLA.get());
        plant.item(ItalianDelightModItems.MOZZARELLA_SALAD.get());
        plant.item(ItalianDelightModItems.MOZZARELLA_PANINI.get());
        //24/24 added, wines/full pizza blocks excluded
    }
}
