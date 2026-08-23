package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import cn.foggyhillside.endsdelight.registry.BlockRegistry;
import cn.foggyhillside.endsdelight.registry.ItemRegistry;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class EndDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemRegistry.AssortedSalad.get());
        plant.item(ItemRegistry.ChorusCookie.get());
        plant.item(ItemRegistry.ChorusFruitPie.get(), getPieValue((PieBlock) BlockRegistry.ChorusFruitPie.get()));
        plant.item(ItemRegistry.ChorusFlowerPie.get());
        plant.item(ItemRegistry.ChorusFruitPieSlice.get());
        plant.item(ItemRegistry.ChorusFruitGrain.get());
        plant.item(ItemRegistry.ChorusFruitPopsicle.get());
        plant.item(ItemRegistry.ChorusSucculent.get());
        plant.item(ItemRegistry.DragonBreathAndChorusSoup.get());
        meat.item(ItemRegistry.DragonLeg.get());
        meat.item(ItemRegistry.DragonLegWithSauce.get());
        meat.item(ItemRegistry.DragonMeatStew.get());
        meat.item(ItemRegistry.DriedEnderMiteMeat.get());
        meat.item(ItemRegistry.EndBarbecueStick.get());
        meat.item(ItemRegistry.EnderCongee.get());
        plant.item(ItemRegistry.EnderSauce.get());
        plant.item(ItemRegistry.EndMixedSalad.get());
        egg.item(ItemRegistry.FriedDragonEgg.get());
        meat.item(ItemRegistry.GrilledShulker.get());
        egg.item(ItemRegistry.LiquidDragonEgg.get());
        meat.item(ItemRegistry.RawDragonMeat.get());
        meat.item(ItemRegistry.RawDragonMeatCuts.get());
        meat.item(ItemRegistry.RawEnderMiteMeat.get());
        meat.item(ItemRegistry.RoastedDragonMeat.get());
        meat.item(ItemRegistry.RoastedDragonMeatCuts.get());
        meat.item(ItemRegistry.RoastedDragonSteak.get());
        meat.item(ItemRegistry.RoastedShulkerMeat.get());
        meat.item(ItemRegistry.RoastedShulkerMeatSlice.get());
        meat.item(ItemRegistry.ShulkerMeat.get());
        meat.item(ItemRegistry.ShulkerMeatSlice.get());
        meat.item(ItemRegistry.SmokedDragonLeg.get());
        meat.item(ItemRegistry.StirFriedShulkerMeat.get());
        plant.item(ItemRegistry.StuffedRiceCake.get());
        plant.item(ItemRegistry.DriedChorusFlower.get(), 1);
        egg.item(ItemRegistry.SteamedDragonEgg.get());
        //33/33 added
    }
}
