package net.dronator.dronators_currencies.datagen;

import net.dronator.dronators_currencies.block.ModBlocks;
import net.dronator.dronators_currencies.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMELTABLES = List.of(
            ModItems.RAW_SILVER,
            ModBlocks.SILVER_ORE,
            ModBlocks.DEEPSLATE_SILVER_ORE
    );

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 200, "silver");
        offerBlasting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 100, "silver");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_SILVER, RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NETHERITE_NUGGET, RecipeCategory.MISC, Items.NETHERITE_INGOT);

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.IRON_COIN, Items.IRON_NUGGET);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.IRON_COIN_STACK, ModItems.IRON_COIN);
        offerShapelessRecipe(exporter, ModItems.IRON_COIN, ModItems.IRON_COIN_STACK, "coin", 4);

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.GOLD_COIN, Items.GOLD_NUGGET);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.GOLD_COIN_STACK, ModItems.GOLD_COIN);
        offerShapelessRecipe(exporter, ModItems.GOLD_COIN, ModItems.GOLD_COIN_STACK, "coin", 4);

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.NETHERITE_COIN, ModItems.NETHERITE_NUGGET);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.NETHERITE_COIN_STACK, ModItems.NETHERITE_COIN);
        offerShapelessRecipe(exporter, ModItems.NETHERITE_COIN, ModItems.NETHERITE_COIN_STACK, "coin", 4);

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SILVER_COIN, ModItems.SILVER_NUGGET);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SILVER_COIN_STACK, ModItems.SILVER_COIN);
        offerShapelessRecipe(exporter, ModItems.SILVER_COIN, ModItems.SILVER_COIN_STACK, "coin", 4);

    }
}
