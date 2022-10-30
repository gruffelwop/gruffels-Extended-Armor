package net.gruffelwop.gea.util;

import net.gruffelwop.gea.geaMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Items {

        public static final TagKey<Item> WOODEN_ARMOR_ITEMS = createTag("wooden_armor_items");
        public static final TagKey<Item> STONE_ARMOR_ITEMS = createTag("stone_armor_items");
        public static final TagKey<Item> METAL_ARMOR_ITEMS = createTag("metal_armor_items");
        public static final TagKey<Item> NETHER_ARMOR_ITEMS = createTag("nether_armor_items");
        public static final TagKey<Item> GEM_ARMOR_ITEMS = createTag("gem_armor_items");
        public static final TagKey<Item> FLAMMABLE_ARMOR_ITEMS = createTag("flammable_armor_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(geaMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }

    }

}
