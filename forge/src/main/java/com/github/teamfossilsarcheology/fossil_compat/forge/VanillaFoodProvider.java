package com.github.teamfossilsarcheology.fossil_compat.forge;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class VanillaFoodProvider {

    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);

        meat.entity(EntityType.AXOLOTL, 5);
        meat.entity(EntityType.BAT, 5);
        meat.entity(EntityType.CAT, 10);
        meat.entity(EntityType.CHICKEN, 7);//Drops not included
        fish.entity(EntityType.COD, 5);
        meat.entity(EntityType.COW, 40);
        fish.entity(EntityType.DOLPHIN, 17);
        meat.entity(EntityType.DONKEY, 45);
        meat.entity(EntityType.FOX, 15);
        meat.entity(EntityType.GOAT, 30);
        fish.entity(EntityType.GLOW_SQUID, 20);
        meat.entity(EntityType.HOGLIN, 55);
        meat.entity(EntityType.HORSE, 55);
        meat.entity(EntityType.LLAMA, 50);
        meat.entity(EntityType.MOOSHROOM, 40);
        meat.entity(EntityType.MULE, 50);
        meat.entity(EntityType.OCELOT, 4);
        meat.entity(EntityType.PANDA, 27);
        meat.entity(EntityType.PARROT, 2);
        meat.entity(EntityType.PIG, 20);
        meat.entity(EntityType.POLAR_BEAR, 60);
        fish.entity(EntityType.PUFFERFISH, 5);
        meat.entity(EntityType.RABBIT, 5);
        fish.entity(EntityType.SALMON, 5);
        meat.entity(EntityType.SHEEP, 35);
        fish.entity(EntityType.SQUID, 20);
        fish.entity(EntityType.TROPICAL_FISH, 5);
        fish.entity(EntityType.TURTLE, 5);
        meat.entity(EntityType.WOLF, 15);

        meat.entity(EntityType.PLAYER, 27);
        meat.entity(EntityType.VILLAGER, 27);
        fish.entity(EntityType.GUARDIAN, 65);
        meat.entity(EntityType.SPIDER, 30);
        meat.entity(EntityType.CAVE_SPIDER, 15);

        egg.item(Items.EGG, 7);

        plant.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/berry")));
        plant.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/bread")));
        plant.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/fruit")));
        plant.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/vegetable")));
        plant.blockTag(BlockTags.LEAVES, 20);
        plant.blockTag(BlockTags.FLOWERS, 5);
        plant.blockTag(BlockTags.SAPLINGS, 15);
        //crop: nutrition * max drop
        plant.block(Blocks.BEETROOTS, Foods.BEETROOT.getNutrition() + 2);
        plant.block(Blocks.BROWN_MUSHROOM, 3);
        plant.block(Blocks.CAKE, 14);
        plant.block(Blocks.CARROTS, Foods.CARROT.getNutrition() * 5);
        plant.block(Blocks.CHORUS_FLOWER, Foods.CHORUS_FRUIT.getNutrition() * 2);
        plant.block(Blocks.CHORUS_PLANT, Foods.CHORUS_FRUIT.getNutrition());
        plant.block(Blocks.GRASS, 1);
        plant.block(Blocks.HAY_BLOCK, 15);
        plant.block(Blocks.KELP, Foods.DRIED_KELP.getNutrition());
        plant.block(Blocks.KELP_PLANT, Foods.DRIED_KELP.getNutrition());
        plant.block(Blocks.LILY_PAD, 2);
        plant.block(Blocks.MELON, Foods.MELON_SLICE.getNutrition() * 5);
        plant.block(Blocks.POTATOES, Foods.POTATO.getNutrition() * 5);
        plant.block(Blocks.PUMPKIN, Foods.MELON_SLICE.getNutrition() * 4);
        plant.block(Blocks.RED_MUSHROOM, 3);
        plant.block(Blocks.SUGAR_CANE, 3);
        plant.block(Blocks.SWEET_BERRY_BUSH, Foods.SWEET_BERRIES.getNutrition() * 3);
        plant.block(Blocks.TALL_GRASS, 2);
        plant.block(Blocks.WHEAT, 3);

        plant.item(Items.APPLE);
        plant.item(Items.BAKED_POTATO);
        plant.item(Items.BEETROOT);
        plant.item(Items.BEETROOT_SEEDS, 5);
        plant.item(Items.BREAD);
        plant.item(Items.CAKE, 14 * 5);
        plant.item(Items.CARROT);
        plant.item(Items.CHORUS_FRUIT);
        plant.item(Items.COOKIE);
        plant.item(Items.DRIED_KELP);
        plant.item(Items.GLOW_BERRIES);
        plant.item(Items.MELON_SEEDS, 5);
        plant.item(Items.MELON_SLICE);
        plant.item(Items.POTATO);
        plant.item(Items.PUMPKIN_PIE);
        plant.item(Items.PUMPKIN_SEEDS, 5);
        plant.item(Items.SUGAR, 7);
        plant.item(Items.SUGAR_CANE, 15);
        plant.item(Items.SWEET_BERRIES);
        plant.item(Items.WHEAT, 13);
        plant.item(Items.WHEAT_SEEDS, 5);

        fish.item(Items.COD);
        fish.item(Items.PUFFERFISH);
        fish.item(Items.SALMON);
        fish.item(Items.TROPICAL_FISH);
        fish.item(Items.COOKED_COD);
        fish.item(Items.COOKED_SALMON);

        meat.item(Items.PORKCHOP);
        meat.item(Items.COOKED_PORKCHOP);
        meat.item(Items.BEEF);
        meat.item(Items.COOKED_BEEF);
        meat.item(Items.COOKED_CHICKEN);
        meat.item(Items.CHICKEN);
        meat.item(Items.MUTTON);
        meat.item(Items.COOKED_MUTTON);
        meat.item(Items.RABBIT);
        meat.item(Items.COOKED_RABBIT);
        meat.item(Items.RABBIT_FOOT, 7);
    }
}
