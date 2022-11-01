package net.gruffelwop.gea.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gruffelwop.gea.geaMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ACACIA_PLANKS_HELMET = registerItem("acacia_planks_helmet", new ArmorItem(ModArmorMaterials.ACACIA_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_PLANKS_CHESTPLATE = registerItem("acacia_planks_chestplate", new ArmorItem(ModArmorMaterials.ACACIA_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_PLANKS_LEGGINGS = registerItem("acacia_planks_leggings", new ArmorItem(ModArmorMaterials.ACACIA_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_PLANKS_BOOTS = registerItem("acacia_planks_boots", new ArmorItem(ModArmorMaterials.ACACIA_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_LOG_HELMET = registerItem("acacia_log_helmet", new ArmorItem(ModArmorMaterials.ACACIA_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_LOG_CHESTPLATE = registerItem("acacia_log_chestplate", new ArmorItem(ModArmorMaterials.ACACIA_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_LOG_LEGGINGS = registerItem("acacia_log_leggings", new ArmorItem(ModArmorMaterials.ACACIA_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item ACACIA_LOG_BOOTS = registerItem("acacia_log_boots", new ArmorItem(ModArmorMaterials.ACACIA_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_PLANKS_HELMET = registerItem("birch_planks_helmet", new ArmorItem(ModArmorMaterials.BIRCH_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_PLANKS_CHESTPLATE = registerItem("birch_planks_chestplate", new ArmorItem(ModArmorMaterials.BIRCH_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_PLANKS_LEGGINGS = registerItem("birch_planks_leggings", new ArmorItem(ModArmorMaterials.BIRCH_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_PLANKS_BOOTS = registerItem("birch_planks_boots", new ArmorItem(ModArmorMaterials.BIRCH_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_LOG_HELMET = registerItem("birch_log_helmet", new ArmorItem(ModArmorMaterials.BIRCH_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_LOG_CHESTPLATE = registerItem("birch_log_chestplate", new ArmorItem(ModArmorMaterials.BIRCH_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_LOG_LEGGINGS = registerItem("birch_log_leggings", new ArmorItem(ModArmorMaterials.BIRCH_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item BIRCH_LOG_BOOTS = registerItem("birch_log_boots", new ArmorItem(ModArmorMaterials.BIRCH_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_PLANKS_HELMET = registerItem("crimson_planks_helmet", new ArmorItem(ModArmorMaterials.CRIMSON_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_PLANKS_CHESTPLATE = registerItem("crimson_planks_chestplate", new ArmorItem(ModArmorMaterials.CRIMSON_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_PLANKS_LEGGINGS = registerItem("crimson_planks_leggings", new ArmorItem(ModArmorMaterials.CRIMSON_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_PLANKS_BOOTS = registerItem("crimson_planks_boots", new ArmorItem(ModArmorMaterials.CRIMSON_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_LOG_HELMET = registerItem("crimson_log_helmet", new ArmorItem(ModArmorMaterials.CRIMSON_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_LOG_CHESTPLATE = registerItem("crimson_log_chestplate", new ArmorItem(ModArmorMaterials.CRIMSON_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_LOG_LEGGINGS = registerItem("crimson_log_leggings", new ArmorItem(ModArmorMaterials.CRIMSON_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item CRIMSON_LOG_BOOTS = registerItem("crimson_log_boots", new ArmorItem(ModArmorMaterials.CRIMSON_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_PLANKS_HELMET = registerItem("dark_oak_planks_helmet", new ArmorItem(ModArmorMaterials.DARK_OAK_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_PLANKS_CHESTPLATE = registerItem("dark_oak_planks_chestplate", new ArmorItem(ModArmorMaterials.DARK_OAK_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_PLANKS_LEGGINGS = registerItem("dark_oak_planks_leggings", new ArmorItem(ModArmorMaterials.DARK_OAK_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_PLANKS_BOOTS = registerItem("dark_oak_planks_boots", new ArmorItem(ModArmorMaterials.DARK_OAK_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_LOG_HELMET = registerItem("dark_oak_log_helmet", new ArmorItem(ModArmorMaterials.DARK_OAK_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_LOG_CHESTPLATE = registerItem("dark_oak_log_chestplate", new ArmorItem(ModArmorMaterials.DARK_OAK_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_LOG_LEGGINGS = registerItem("dark_oak_log_leggings", new ArmorItem(ModArmorMaterials.DARK_OAK_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item DARK_OAK_LOG_BOOTS = registerItem("dark_oak_log_boots", new ArmorItem(ModArmorMaterials.DARK_OAK_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_PLANKS_HELMET = registerItem("jungle_planks_helmet", new ArmorItem(ModArmorMaterials.JUNGLE_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_PLANKS_CHESTPLATE = registerItem("jungle_planks_chestplate", new ArmorItem(ModArmorMaterials.JUNGLE_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_PLANKS_LEGGINGS = registerItem("jungle_planks_leggings", new ArmorItem(ModArmorMaterials.JUNGLE_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_PLANKS_BOOTS = registerItem("jungle_planks_boots", new ArmorItem(ModArmorMaterials.JUNGLE_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_LOG_HELMET = registerItem("jungle_log_helmet", new ArmorItem(ModArmorMaterials.JUNGLE_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_LOG_CHESTPLATE = registerItem("jungle_log_chestplate", new ArmorItem(ModArmorMaterials.JUNGLE_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_LOG_LEGGINGS = registerItem("jungle_log_leggings", new ArmorItem(ModArmorMaterials.JUNGLE_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item JUNGLE_LOG_BOOTS = registerItem("jungle_log_boots", new ArmorItem(ModArmorMaterials.JUNGLE_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_PLANKS_HELMET = registerItem("mangrove_planks_helmet", new ArmorItem(ModArmorMaterials.MANGROVE_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_PLANKS_CHESTPLATE = registerItem("mangrove_planks_chestplate", new ArmorItem(ModArmorMaterials.MANGROVE_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_PLANKS_LEGGINGS = registerItem("mangrove_planks_leggings", new ArmorItem(ModArmorMaterials.MANGROVE_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_PLANKS_BOOTS = registerItem("mangrove_planks_boots", new ArmorItem(ModArmorMaterials.MANGROVE_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_LOG_HELMET = registerItem("mangrove_log_helmet", new ArmorItem(ModArmorMaterials.MANGROVE_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_LOG_CHESTPLATE = registerItem("mangrove_log_chestplate", new ArmorItem(ModArmorMaterials.MANGROVE_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_LOG_LEGGINGS = registerItem("mangrove_log_leggings", new ArmorItem(ModArmorMaterials.MANGROVE_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item MANGROVE_LOG_BOOTS = registerItem("mangrove_log_boots", new ArmorItem(ModArmorMaterials.MANGROVE_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_PLANKS_HELMET = registerItem("oak_planks_helmet", new ArmorItem(ModArmorMaterials.OAK_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_PLANKS_CHESTPLATE = registerItem("oak_planks_chestplate", new ArmorItem(ModArmorMaterials.OAK_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_PLANKS_LEGGINGS = registerItem("oak_planks_leggings", new ArmorItem(ModArmorMaterials.OAK_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_PLANKS_BOOTS = registerItem("oak_planks_boots", new ArmorItem(ModArmorMaterials.OAK_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_LOG_HELMET = registerItem("oak_log_helmet", new ArmorItem(ModArmorMaterials.OAK_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_LOG_CHESTPLATE = registerItem("oak_log_chestplate", new ArmorItem(ModArmorMaterials.OAK_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_LOG_LEGGINGS = registerItem("oak_log_leggings", new ArmorItem(ModArmorMaterials.OAK_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item OAK_LOG_BOOTS = registerItem("oak_log_boots", new ArmorItem(ModArmorMaterials.OAK_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_PLANKS_HELMET = registerItem("spruce_planks_helmet", new ArmorItem(ModArmorMaterials.SPRUCE_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_PLANKS_CHESTPLATE = registerItem("spruce_planks_chestplate", new ArmorItem(ModArmorMaterials.SPRUCE_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_PLANKS_LEGGINGS = registerItem("spruce_planks_leggings", new ArmorItem(ModArmorMaterials.SPRUCE_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_PLANKS_BOOTS = registerItem("spruce_planks_boots", new ArmorItem(ModArmorMaterials.SPRUCE_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_LOG_HELMET = registerItem("spruce_log_helmet", new ArmorItem(ModArmorMaterials.SPRUCE_LOG, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_LOG_CHESTPLATE = registerItem("spruce_log_chestplate", new ArmorItem(ModArmorMaterials.SPRUCE_LOG, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_LOG_LEGGINGS = registerItem("spruce_log_leggings", new ArmorItem(ModArmorMaterials.SPRUCE_LOG, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item SPRUCE_LOG_BOOTS = registerItem("spruce_log_boots", new ArmorItem(ModArmorMaterials.SPRUCE_LOG, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_PLANKS_HELMET = registerItem("warped_planks_helmet", new ArmorItem(ModArmorMaterials.WARPED_PLANKS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_PLANKS_CHESTPLATE = registerItem("warped_planks_chestplate", new ArmorItem(ModArmorMaterials.WARPED_PLANKS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_PLANKS_LEGGINGS = registerItem("warped_planks_leggings", new ArmorItem(ModArmorMaterials.WARPED_PLANKS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_PLANKS_BOOTS = registerItem("warped_planks_boots", new ArmorItem(ModArmorMaterials.WARPED_PLANKS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_STEM_HELMET = registerItem("warped_stem_helmet", new ArmorItem(ModArmorMaterials.WARPED_STEM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_STEM_CHESTPLATE = registerItem("warped_stem_chestplate", new ArmorItem(ModArmorMaterials.WARPED_STEM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_STEM_LEGGINGS = registerItem("warped_stem_leggings", new ArmorItem(ModArmorMaterials.WARPED_STEM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item WARPED_STEM_BOOTS = registerItem("warped_stem_boots", new ArmorItem(ModArmorMaterials.WARPED_STEM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));



    public static final Item STONE_HELMET = registerItem("stone_helmet", new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item STONE_CHESTPLATE = registerItem("stone_chestplate", new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item STONE_LEGGINGS = registerItem("stone_leggings", new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item STONE_BOOTS = registerItem("stone_boots", new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COBBLESTONE_HELMET = registerItem("cobblestone_helmet", new ArmorItem(ModArmorMaterials.COBBLESTONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COBBLESTONE_CHESTPLATE = registerItem("cobblestone_chestplate", new ArmorItem(ModArmorMaterials.COBBLESTONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COBBLESTONE_LEGGINGS = registerItem("cobblestone_leggings", new ArmorItem(ModArmorMaterials.COBBLESTONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COBBLESTONE_BOOTS = registerItem("cobblestone_boots", new ArmorItem(ModArmorMaterials.COBBLESTONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet", new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate", new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings", new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots", new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item LAPIS_HELMET = registerItem("lapis_helmet", new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item LAPIS_CHESTPLATE = registerItem("lapis_chestplate", new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item LAPIS_LEGGINGS = registerItem("lapis_leggings", new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item LAPIS_BOOTS = registerItem("lapis_boots", new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.CREATIVE_TAB)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(geaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items for " + geaMod.MOD_ID);
    }

}
