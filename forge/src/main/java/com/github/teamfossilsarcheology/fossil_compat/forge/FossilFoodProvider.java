package com.github.teamfossilsarcheology.fossil_compat.forge;

import com.github.teamfossilsarcheology.fossil.block.ModBlocks;
import com.github.teamfossilsarcheology.fossil.block.PrehistoricPlantInfo;
import com.github.teamfossilsarcheology.fossil.item.ModItems;
import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.minecraft.world.food.Foods;

public class FossilFoodProvider {

    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);

        plant.block(PrehistoricPlantInfo.BENNETTITALES_LARGE.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.BENNETTITALES_SMALL.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.CEPHALOTAXUS.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.CRATAEGUS.getPlantBlock(), Foods.SWEET_BERRIES.getNutrition() * 3 + 1);
        plant.block(PrehistoricPlantInfo.CYATHEA.getPlantBlock(), 12);
        plant.block(PrehistoricPlantInfo.DICTYOPHYLLUM.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.DILLHOFFIA.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.DIPTERIS.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.DUISBERGIA.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.EPHEDRA.getPlantBlock(), Foods.SWEET_BERRIES.getNutrition() * 2 + 1);
        plant.block(PrehistoricPlantInfo.FLORISSANTIA.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.FOOZIA.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.HORSETAIL_LARGE.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.HORSETAIL_SMALL.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.LICOPODIOPHYTA.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.OSMUNDA.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.SAGENOPTERIS.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.SARRACENIA.getPlantBlock(), 6);
        plant.block(PrehistoricPlantInfo.VACCINIUM.getPlantBlock(), Foods.SWEET_BERRIES.getNutrition() * 3 + 1);
        plant.block(PrehistoricPlantInfo.WELWITSCHIA.getPlantBlock(), 3);
        plant.block(PrehistoricPlantInfo.ZAMITES.getPlantBlock(), 6);
        plant.block(ModBlocks.FERNS.get(), 3);
        plant.item(ModItems.FERN_SEED.get(), 5);
        meat.item(ModItems.FAILURESAURUS_FLESH.get(), 15);
    }
}
