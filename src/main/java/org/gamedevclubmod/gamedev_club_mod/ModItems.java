package org.gamedevclubmod.gamedev_club_mod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import org.intellij.lang.annotations.Identifier;

public class ModItems {

    public static SwordItem TITANIUM_SWORD = new SwordItem(Tiers.DIAMOND, 4, -2.4f, new Item.Properties());

    public static void OnInitialize() {
        Items.registerItem("gamedev_club_mod:titanium_sword", TITANIUM_SWORD);
    }
}
