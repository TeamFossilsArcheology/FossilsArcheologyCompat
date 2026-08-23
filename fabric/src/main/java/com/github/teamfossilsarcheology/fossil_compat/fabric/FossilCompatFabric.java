package com.github.teamfossilsarcheology.fossil_compat.fabric;

import com.github.teamfossilsarcheology.fossil_compat.FossilCompat;
import net.fabricmc.api.ModInitializer;

public final class FossilCompatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        FossilCompat.init();
    }
}
