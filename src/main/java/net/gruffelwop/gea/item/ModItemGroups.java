package net.gruffelwop.gea.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gruffelwop.gea.geaMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CREATIVE_TAB = FabricItemGroupBuilder.build(new Identifier(geaMod.MOD_ID, "gea"),
            () -> new ItemStack(ModItems.QUARTZ_CHESTPLATE));

}
