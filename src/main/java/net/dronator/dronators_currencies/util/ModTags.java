package net.dronator.dronators_currencies.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.dronator.dronators_currencies.DronatorsCurrencies.MOD_ID;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> SILVER = createTag("silver");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKey.BLOCK, new Identifier(MOD_ID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> COINS = createTag("coins");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKey.ITEM, new Identifier(MOD_ID, name));
        }
    }
}
