package com.github.teamfossilsarcheology.fossil_compat.forge;

import com.github.teamfossilsarcheology.fossil_compat.FossilCompat;
import net.minecraftforge.fml.common.Mod;

@Mod(FossilCompat.MOD_ID)
public final class FossilCompatForge {
    public FossilCompatForge() {
        // Run our common setup.
        FossilCompat.init();
    }
}
