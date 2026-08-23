package com.github.teamfossilsarcheology.fossil_compat.forge.data;

import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.github.teamfossilsarcheology.fossil_compat.OtherCompat;
import com.github.teamfossilsarcheology.fossil_compat.VanillaFoodProvider;
import com.github.teamfossilsarcheology.fossil_compat.forge.compat.*;
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
        AlexDelightCompat.bootstrap(this);
        ArgentinaDelightCompat.bootstrap(this);
        BrewinAndChewinCompat.bootstrap(this);
        ButcherDelightFoodCompat.bootstrap(this);
        CasualnessDelightCompat.bootstrap(this);
        CoffeeDelightCompat.bootstrap(this);
        CornDelightCompat.bootstrap(this);
        CrabberDelightCompat.bootstrap(this);
        CulturalDelightCompat.bootstrap(this);
        DelightfulCompat.bootstrap(this);
        EndDelightCompat.bootstrap(this);
        EnderDelightCompat.bootstrap(this);
        FarmerRespiteCompat.bootstrap(this);
        FestiveDelightCompat.bootstrap(this);
        HoneyExpansionCompat.bootstrap(this);
        ItalianDelightCompat.bootstrap(this);
        LargeMealsCompat.bootstrap(this);
        MinersDelightCompat.bootstrap(this);
        NetherDelightCompat.bootstrap(this);
        OceanDelightCompat.bootstrap(this);
        PineappleDelightCompat.bootstrap(this);
        SeedDelightCompat.bootstrap(this);

        BetterAnimalsPlusCompat.bootstrap(this);
        ExoticBirdsCompat.bootstrap(this);
        NaturalistCompat.bootstrap(this);
        OtherCompat.bootstrap(this);
    }

    @Override
    public @NotNull String getName() {
        return "Food Values";
    }
}
