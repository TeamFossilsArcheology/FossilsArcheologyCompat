package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.va11halla.casualness_delight.item.FoodList;
import com.va11halla.casualness_delight.registry.ItemRegistry;
import net.minecraft.world.food.Foods;
import vectorwing.farmersdelight.common.FoodValues;

public class CasualnessDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        fish.item(ItemRegistry.FishAndChips.get());
        plant.item(ItemRegistry.YorkshirePudding.get());
        meat.item(ItemRegistry.BeefNoodles.get());
        meat.item(ItemRegistry.QuicheLorraineSlice.get());
        //meat.item(ItemRegistry.StargazyPie.get()); excluded because it gives you nausea
        fish.item(ItemRegistry.BowlOfPaperWrappedFish.get());
        meat.item(ItemRegistry.BoboChicken.get());
        meat.item(ItemRegistry.PhantomDumplings.get());
        //2 cheese wheels and cheese wheel slice excluded because they are made of milk, so they don't fit into any food category
        //meat.item(ItemRegistry.PhantomPuff.get()); Phantom membrane is not edible, and this is just phantom membrane+cheese+milk
        //meat.item(ItemRegistry.SpicyStrips.get()); Excluded because it gives rotten effect
        //meat.item(ItemRegistry.GreenTongue.get()); Popsicle, so a no-go
        plant.item(ItemRegistry.RawGluten.get());
        plant.item(ItemRegistry.Gluten.get());
        plant.item(ItemRegistry.GlutenSkewer.get());
        plant.item(ItemRegistry.RoastGluten.get());
        meat.item(ItemRegistry.RawDonkeyMeat.get());
        meat.item(ItemRegistry.CookedDonkeyMeat.get());
        meat.item(ItemRegistry.DonkeyBurger.get());
        plant.item(ItemRegistry.RawPotatoBoboChicken.get(), Foods.POTATO.getNutrition()); //This is just a potato+a stick
        plant.item(ItemRegistry.RawCabbageBoboChicken.get(), FoodValues.CABBAGE.getNutrition()); //This is just a cabbage+a stick
        meat.item(ItemRegistry.RawChickenBoboChicken.get(), Foods.CHICKEN.getNutrition());
        plant.item(ItemRegistry.PotatoBoboChicken.get());
        plant.item(ItemRegistry.CabbageBoboChicken.get());
        meat.item(ItemRegistry.ChickenBoboChicken.get());
        plant.item(ItemRegistry.PotatoSlice.get(), Foods.POTATO.getNutrition());
        plant.item(ItemRegistry.PotatoChip.get());
        meat.item(ItemRegistry.RawSpringRoll.get(), FoodList.SpringRoll.getNutrition());
        meat.item(ItemRegistry.SpringRoll.get());
        meat.item(ItemRegistry.SpringRollMedley.get(), 6 * FoodList.SpringRoll.getNutrition()); //Made of 6 spring rolls
        meat.item(ItemRegistry.FriedChickenChip.get());
        fish.item(ItemRegistry.FriedFish.get());
        meat.item(ItemRegistry.Tonkatsu.get());
        meat.item(ItemRegistry.RawFriedDumpling.get());
        meat.item(ItemRegistry.FriedDumpling.get());
        meat.item(ItemRegistry.BowlOfFriedDumpling.get());
        plant.item(ItemRegistry.BowlOfSweetRice.get());
        //32/39, 7 excluded
    }
}
