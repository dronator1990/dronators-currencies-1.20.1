package net.dronator.dronators_currencies;

import net.dronator.dronators_currencies.block.ModBlocks;
import net.dronator.dronators_currencies.item.ModItemGroups;
import net.dronator.dronators_currencies.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DronatorsCurrencies implements ModInitializer {
	public static final String MOD_ID = "dronators_currencies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}