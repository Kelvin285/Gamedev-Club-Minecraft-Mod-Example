package org.gamedevclubmod.gamedev_club_mod;

import net.fabricmc.api.ModInitializer;

public class GamedevClubMod implements ModInitializer {
    /**
     * Runs the mod initializer.
     */


    @Override
    public void onInitialize() {
        ModItems.OnInitialize();
    }
}
