package com.github.teamfossilsarcheology.fossil_compat.forge.data;

import com.github.teamfossilsarcheology.fossil_compat.FossilCompat;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FossilCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void register(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ModFoodValueProvider(generator));
        generator.addProvider(new FossilFarmersRecipeProvider(generator));
    }
}
