package net.dronator.dronators_currencies.datagen;

import net.dronator.dronators_currencies.block.ModBlocks;
import net.dronator.dronators_currencies.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.SILVER_ORES)
                .add(ModBlocks.SILVER_ORE.asItem())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.asItem());
    }
}
