package com.github.teamfossilsarcheology.fossil_compat.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FossilDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(new ModFoodValueProvider(generator));
        generator.addProvider(new FossilFarmersRecipeProvider(generator));
    }

}