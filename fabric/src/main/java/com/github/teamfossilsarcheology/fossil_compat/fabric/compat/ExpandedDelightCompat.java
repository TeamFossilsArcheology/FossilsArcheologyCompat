package com.github.teamfossilsarcheology.fossil_compat.fabric.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.ianm1647.expandeddelight.block.BlockList;
import com.ianm1647.expandeddelight.item.ItemList;

public class ExpandedDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(ItemList.RAW_CINNAMON, 5);
        plant.item(ItemList.GROUND_CINNAMON, 15);
        plant.item(ItemList.ASPARAGUS_SEEDS, 5);
        plant.item(ItemList.CHILI_PEPPER_SEEDS, 5);
        plant.item(ItemList.ASPARAGUS);
        plant.item(ItemList.SWEET_POTATO);
        plant.item(ItemList.CHILI_PEPPER);
        plant.item(ItemList.PEANUT);
        plant.item(ItemList.BAKED_SWEET_POTATO);
        plant.item(ItemList.PEANUT_BUTTER);
        //cheese wheel, cheese slice, cheese sandwich and grilled cheese excluded
        plant.item(ItemList.PEANUT_BUTTER_SANDWICH);
        plant.item(ItemList.PEANUT_BUTTER_HONEY_SANDWICH);
        plant.item(ItemList.GLOW_BERRY_JELLY_SANDWICH);
        plant.item(ItemList.SWEET_BERRY_JELLY_SANDWICH);
        plant.item(ItemList.SWEET_ROLL);
        plant.item(ItemList.BERRY_SWEET_ROLL);
        plant.item(ItemList.GLOW_BERRY_SWEET_ROLL);
        plant.item(ItemList.CINNAMON_RICE);
        plant.item(ItemList.CINNAMON_APPLES);
        //2 cookies excluded
        plant.item(ItemList.SNICKERDOODLE);
        plant.item(ItemList.PEANUT_SALAD);
        plant.item(ItemList.SWEET_POTATO_SALAD);
        plant.item(ItemList.ASPARAGUS_SOUP);
        plant.item(ItemList.ASPARAGUS_SOUP_CREAMY);
        plant.item(ItemList.PEANUT_HONEY_SOUP);
        //Mac and cheese excluded
        //Cheesy asparagus and bacon excluded
        plant.item(ItemList.PEPERONATA); //Pasta with onions, vegetables and tomatoes
        plant.block(BlockList.CINNAMON_SAPLING, 15);
        plant.item(ItemList.GLOW_BERRY_JELLY_SANDWICH);
    }

}
