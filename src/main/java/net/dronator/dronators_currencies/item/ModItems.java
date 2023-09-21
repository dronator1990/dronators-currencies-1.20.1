package net.dronator.dronators_currencies.item;

import net.dronator.dronators_currencies.DronatorsCurrencies;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.dronator.dronators_currencies.DronatorsCurrencies.MOD_ID;

public class ModItems {

    public static final Item IRON_COIN = registerItem("iron_coin", new Item((new FabricItemSettings())));
    public static final Item IRON_COIN_STACK = registerItem("iron_coin_stack", new Item((new FabricItemSettings())));

    public static final Item GOLD_COIN = registerItem("gold_coin", new Item((new FabricItemSettings())));
    public static final Item GOLD_COIN_STACK = registerItem("gold_coin_stack", new Item((new FabricItemSettings())));

    public static final Item NETHERITE_COIN = registerItem("netherite_coin", new Item((new FabricItemSettings())));
    public static final Item NETHERITE_COIN_STACK = registerItem("netherite_coin_stack", new Item((new FabricItemSettings())));

    //public static final Item COPPER_COIN = registerItem("iron_coin_stack", new Item((new FabricItemSettings())));
    //public static final Item COPPER_COIN_STACK = registerItem("iron_coin_stack", new Item((new FabricItemSettings())));

    public static final Item RAW_SILVER = registerItem("raw_silver", new Item((new FabricItemSettings())));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item((new FabricItemSettings())));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item((new FabricItemSettings())));
    public static final Item SILVER_COIN = registerItem("silver_coin", new Item((new FabricItemSettings())));
    public static final Item SILVER_COIN_STACK = registerItem("silver_coin_stack", new Item((new FabricItemSettings())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        DronatorsCurrencies.LOGGER.info("Registering Mod Items for" + MOD_ID);
    }
}
