package com.github.teamfossilsarcheology.fossil_compat.fabric.data;

import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.github.teamfossilsarcheology.fossil_compat.OtherCompat;
import com.github.teamfossilsarcheology.fossil_compat.VanillaFoodProvider;
import com.github.teamfossilsarcheology.fossil_compat.fabric.compat.*;
import net.minecraft.data.DataGenerator;
import org.jetbrains.annotations.NotNull;

public class ModFoodValueProvider extends FoodValueProvider {

    public ModFoodValueProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildFoodValues() {
        FossilFoodProvider.bootstrap(this);
        VanillaFoodProvider.bootstrap(this);

        FarmersDelightCompat.bootstrap(this);
        CasualnessDelightCompat.bootstrap(this);
        CoffeeDelightCompat.bootstrap(this);
        CulturalDelightCompat.bootstrap(this);
        EndDelightCompat.bootstrap(this);
        ExpandedDelightCompat.bootstrap(this);
        FarmerRespiteCompat.bootstrap(this);
        NetherDelightCompat.bootstrap(this);
        OceanDelightCompat.bootstrap(this);
        PineappleDelightCompat.bootstrap(this);

        BetterAnimalsPlusCompat.bootstrap(this);
        NaturalistCompat.bootstrap(this);
        OtherCompat.bootstrap(this);
    }

    @Override
    public @NotNull String getName() {
        return "Food Values";
    }
}
