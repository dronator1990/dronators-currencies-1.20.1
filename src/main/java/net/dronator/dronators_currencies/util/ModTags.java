package net.dronator.dronators_currencies.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static net.dronator.dronators_currencies.DronatorsCurrencies.MOD_ID;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SILVER_ORES = createTag("silver_ores");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, name));
        }
    }
}
