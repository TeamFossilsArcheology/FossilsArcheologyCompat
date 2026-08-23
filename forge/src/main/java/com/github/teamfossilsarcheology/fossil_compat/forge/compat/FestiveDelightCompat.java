package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.mcreator.festivedelight.init.FestiveDelightModBlocks;
import net.mcreator.festivedelight.init.FestiveDelightModItems;

public class FestiveDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        meat.item(FestiveDelightModItems.FESTIVE_CHIKEN.get());
        plant.item(FestiveDelightModItems.CINNAMON_POWDER.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_DOUGH.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_MAN_DOUGH.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_DOUGH_CREEPER.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_DOUGH_STAR.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_DOUGH_BLOCK.get(), 2);
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_BLOCK.get());
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_CREEPER.get());
        plant.item(FestiveDelightModItems.GINGERBREAD_COOKIE_STAR.get());
        plant.item(FestiveDelightModItems.GINGERBREAD_MAN.get());
        plant.item(FestiveDelightModItems.GINGERBREAD_MAN_BASE.get());
        plant.item(FestiveDelightModItems.GINGERBREAD.get());
        //plant.item(FestiveDelightModItems.SUGAR_CANE.get()); Not suitable for dinos
        plant.block(FestiveDelightModBlocks.CINNAMON_BUSH.get(), 1);
        //14/15 added, 1 excluded
    }
}
