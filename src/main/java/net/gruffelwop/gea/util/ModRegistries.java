package net.gruffelwop.gea.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.gruffelwop.gea.geaMod;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering fuels for " + geaMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModTags.Items.FLAMMABLE_ARMOR_ITEMS, 300); // 300 as most other wooden items have this value
    }
}
