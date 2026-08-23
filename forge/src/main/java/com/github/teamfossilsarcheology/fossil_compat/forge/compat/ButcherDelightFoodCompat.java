package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.mcreator.butchersdelightfoods.init.ButchersdelightfoodsModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ButcherDelightFoodCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        for (RegistryObject<Item> food : ButchersdelightfoodsModItems.REGISTRY.getEntries()) {
            meat.item(food.get());
        }
        //This is safe to do because literally all Butcher Delight Foods items are raw and cooked meat
    }
}
