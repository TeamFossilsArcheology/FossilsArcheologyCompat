package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import cn.foggyhillside.ends_delight.registry.ModBlock;
import cn.foggyhillside.ends_delight.registry.ModItem;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.nhoryzon.mc.farmersdelight.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil.fabric.compat.farmers.FarmersDelightCompat.getPieValue;

public class EndDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ModItem.AssortedSalad.get());
        plant.item(ModItem.ChorusCookie.get());
        plant.item(ModItem.ChorusFruitPie.get(), getPieValue((PieBlock) ModBlock.ChorusFruitPie));
        plant.item(ModItem.ChorusFlowerPie.get());
        plant.item(ModItem.ChorusFruitPieSlice.get());
        plant.item(ModItem.ChorusFruitGrain.get());
        plant.item(ModItem.ChorusFruitPopsicle.get());
        plant.item(ModItem.ChorusSucculent.get());
        plant.item(ModItem.DragonBreathAndChorusSoup.get());
        meat.item(ModItem.DragonLeg.get());
        meat.item(ModItem.DragonLegWithSauce.get());
        meat.item(ModItem.DragonMeatStew.get());
        meat.item(ModItem.DriedEnderMiteMeat.get());
        meat.item(ModItem.EndBarbecueStick.get());
        meat.item(ModItem.EnderCongee.get());
        plant.item(ModItem.EnderSauce.get());
        plant.item(ModItem.EndMixedSalad.get());
        egg.item(ModItem.FriedDragonEgg.get());
        meat.item(ModItem.GrilledShulker.get());
        egg.item(ModItem.LiquidDragonEgg.get());
        meat.item(ModItem.RawDragonMeat.get());
        meat.item(ModItem.RawDragonMeatCuts.get());
        meat.item(ModItem.RawEnderMiteMeat.get());
        meat.item(ModItem.RoastedDragonMeat.get());
        meat.item(ModItem.RoastedDragonMeatCuts.get());
        meat.item(ModItem.RoastedDragonSteak.get());
        meat.item(ModItem.RoastedShulkerMeat.get());
        meat.item(ModItem.RoastedShulkerMeatSlice.get());
        meat.item(ModItem.ShulkerMeat.get());
        meat.item(ModItem.ShulkerMeatSlice.get());
        meat.item(ModItem.SmokedDragonLeg.get());
        meat.item(ModItem.StirFriedShulkerMeat.get());
        plant.item(ModItem.StuffedRiceCake.get());
        plant.item(ModItem.DriedChorusFlower.get(), 5);
        egg.item(ModItem.SteamedDragonEgg.get());
        //33/33 added
    }
}
