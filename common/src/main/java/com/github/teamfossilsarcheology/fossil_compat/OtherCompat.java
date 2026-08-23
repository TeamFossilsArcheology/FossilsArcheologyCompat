package com.github.teamfossilsarcheology.fossil_compat;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;

public class OtherCompat {

    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);

        fish.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/raw_fish")));
        fish.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/cooked_fish")));

        meat.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/raw_meat")));
        meat.itemTag(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("c:foods/cooked_meat")));

        //These are probably outdated
        meat.entity(new ResourceLocation("rats", "rat"), 5);

        meat.entity(new ResourceLocation("totemic", "buffalo"), 55);
        meat.entity(new ResourceLocation("totemic", "bald_eagle"), 8);

        meat.entity(new ResourceLocation("quark", "crab"), 5);
        meat.entity(new ResourceLocation("quark", "frog"), 3);

        meat.entity(new ResourceLocation("twilightforest", "boar"), 20);
        meat.entity(new ResourceLocation("twilightforest", "bighorn_sheep"), 35);
        meat.entity(new ResourceLocation("twilightforest", "deer"), 35);
        meat.entity(new ResourceLocation("twilightforest", "penguin"), 10);
        meat.entity(new ResourceLocation("twilightforest", "squirrel"), 3);
    }
}
