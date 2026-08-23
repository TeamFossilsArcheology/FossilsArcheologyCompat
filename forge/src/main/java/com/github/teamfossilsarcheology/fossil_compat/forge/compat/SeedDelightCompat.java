package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import org.hiedacamellia.seeddelight.registry.BlockRegistry;
import org.hiedacamellia.seeddelight.registry.ItemRegistry;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class SeedDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemRegistry.Acorn.get(), 1);
        plant.item(ItemRegistry.AcornKernel.get());
        plant.item(ItemRegistry.Pinecone.get(), 1);
        plant.item(ItemRegistry.PineNutKernel.get());
        plant.item(ItemRegistry.SunflowerSeed.get(), 1);
        plant.item(ItemRegistry.FriedSunflowerSeed.get());
        plant.item(ItemRegistry.DriedWatermelonSeed.get());
        plant.item(ItemRegistry.DriedWatermelonSeed.get());
        plant.item(ItemRegistry.Rosehip.get());
        plant.item(ItemRegistry.Cherry.get());
        plant.item(ItemRegistry.RawAcornNoodle.get());
        plant.item(ItemRegistry.RosehipJamSandwich.get());
        plant.item(ItemRegistry.CherryJamSandwich.get());
        plant.item(ItemRegistry.SunflowerSeedCrisp.get());
        plant.item(ItemRegistry.SunflowerSeedToast.get());
        plant.item(ItemRegistry.SeedRosehipPie.get());
        meat.item(ItemRegistry.RoastedBeefWithSeed.get());
        plant.item(ItemRegistry.AcornTofu.get());
        plant.item(ItemRegistry.StirFriedCabbageWithAcorn.get());
        plant.item(ItemRegistry.AcornBread.get());
        plant.item(ItemRegistry.PinenutGruel.get());
        plant.item(ItemRegistry.PinenutCake.get());
        plant.item(ItemRegistry.SeedTart.get());
        meat.item(ItemRegistry.PinenutWithMeatballs.get());
        plant.item(ItemRegistry.RoseCookie.get());
        plant.item(ItemRegistry.RosehipCake.get());
        meat.item(ItemRegistry.CherryPork.get());
        plant.item(ItemRegistry.MilkCherryMouss.get());
        plant.item(ItemRegistry.RosehipPie.get(), getPieValue((PieBlock) BlockRegistry.RosehipPie.get()));
        plant.item(ItemRegistry.RosehipPieSlice.get());
        //30/30 added
    }
}
