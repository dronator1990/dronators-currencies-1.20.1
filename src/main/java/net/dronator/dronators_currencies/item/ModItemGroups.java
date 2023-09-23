package net.dronator.dronators_currencies.item;

import net.dronator.dronators_currencies.DronatorsCurrencies;
import net.dronator.dronators_currencies.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.dronator.dronators_currencies.DronatorsCurrencies.MOD_ID;

public class ModItemGroups {

    public static final ItemGroup DRONATORS_CURRENCIES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "dronators_currencies"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dronators_currencies"))
                    .icon(() -> new ItemStack(ModItems.IRON_COIN_STACK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.COPPER_COIN_STACK);
                        entries.add(ModItems.IRON_COIN);
                        entries.add(ModItems.IRON_COIN_STACK);
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.GOLD_COIN_STACK);
                        entries.add(ModItems.NETHERITE_COIN);
                        entries.add(ModItems.NETHERITE_COIN_STACK);
                        entries.add(ModItems.SILVER_COIN);
                        entries.add(ModItems.SILVER_COIN_STACK);

                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.NETHERITE_NUGGET);
                    }).build());

    public static void  registerItemGroups() {
        DronatorsCurrencies.LOGGER.info("Registering Item Groups for" + MOD_ID);
    }
}
