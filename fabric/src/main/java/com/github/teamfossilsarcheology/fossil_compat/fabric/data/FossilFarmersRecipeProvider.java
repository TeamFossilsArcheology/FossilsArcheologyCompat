package com.github.teamfossilsarcheology.fossil_compat.fabric.data;

import com.github.teamfossilsarcheology.fossil.FossilMod;
import com.github.teamfossilsarcheology.fossil.tags.ModItemTags;
import com.github.teamfossilsarcheology.fossil.util.ModConstants;
import com.nhoryzon.mc.farmersdelight.registry.ItemsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class FossilFarmersRecipeProvider extends FabricRecipeProvider {
    public FossilFarmersRecipeProvider(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateRecipes(Consumer<FinishedRecipe> consumer) {
        fullCooking(ModItemTags.COOKABLE_EGGS, ItemsRegistry.FRIED_EGG.get(), "fa_cookable_eggs_to_fried_egg", consumer, 0.5f);
    }

    private void fullCooking(Ingredient ingredient, ItemPredicate predicate, ItemLike result, String ingredientName, String resultName, Consumer<FinishedRecipe> consumer, float exp) {
        ResourceLocation baseLocation = FossilMod.location(resultName);
        var furnace = SimpleCookingRecipeBuilder.smelting(ingredient, result, exp, 200)
                .unlockedBy("has_" + ingredientName, inventoryTrigger(predicate));
        var campfire = SimpleCookingRecipeBuilder.campfireCooking(ingredient, result, exp, 600)
                .unlockedBy("has_" + ingredientName, inventoryTrigger(predicate));
        var smoker = SimpleCookingRecipeBuilder.smoking(ingredient, result, exp, 100)
                .unlockedBy("has_" + ingredientName, inventoryTrigger(predicate));
        furnace.save(withConditions(consumer, DefaultResourceConditions.anyModLoaded(ModConstants.FARMERS)), baseLocation);
        campfire.save(withConditions(consumer, DefaultResourceConditions.anyModLoaded(ModConstants.FARMERS)), baseLocation + "_from_campfire_cooking");
        smoker.save(withConditions(consumer, DefaultResourceConditions.anyModLoaded(ModConstants.FARMERS)), baseLocation + "_from_smoking");
    }

    private void fullCooking(TagKey<Item> ingredient, ItemLike result, String resultName, Consumer<FinishedRecipe> consumer, float exp) {
        fullCooking(Ingredient.of(ingredient), ItemPredicate.Builder.item().of(ingredient).build(), result, ingredient.location().getPath(), resultName, consumer, exp);
    }

    private void fullCooking(ItemLike ingredient, ItemLike result, String resultName, Consumer<FinishedRecipe> consumer, float exp) {
        fullCooking(Ingredient.of(ingredient), ItemPredicate.Builder.item().of(ingredient).build(), result, RecipeBuilder.getDefaultRecipeId(ingredient).getPath(), resultName, consumer, exp);
    }

    private void fullCooking(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer, float exp) {
        fullCooking(ingredient, result, RecipeBuilder.getDefaultRecipeId(result).toString(), consumer, exp);
    }
}
