package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import com.hollingsworth.arsnouveau.setup.ItemsRegistry;
import net.brdle.delightful.common.block.DelightfulBlocks;
import net.brdle.delightful.common.item.DelightfulItems;
import potionstudios.byg.common.item.BYGItems;
import vectorwing.farmersdelight.common.block.PieBlock;

import static com.github.teamfossilsarcheology.fossil_compat.forge.compat.FarmersDelightCompat.getPieValue;

public class DelightfulCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        plant.item(DelightfulItems.ACORN.get());
        meat.item(DelightfulItems.ANIMAL_FAT.get());
        plant.item(DelightfulItems.CACTUS_FLESH.get());
        plant.item(DelightfulItems.CACTUS_STEAK.get());
        plant.item(DelightfulItems.CANTALOUPE_SLICE.get());
        meat.item(DelightfulItems.CHEESEBURGER.get());
        plant.item(DelightfulItems.CHOPPED_CLOVER.get());
        meat.item(DelightfulItems.CHUNK_NUGGET.get()); //These chunk things seem like meat, they are from a mod called Rotten Leather(Delightful has compatability for that mod)
        meat.item(DelightfulItems.CHUNKWICH.get());
        plant.item(DelightfulItems.COCONUT_CURRY.get()); //Has coconut in it so I counted it as a plant
        meat.item(DelightfulItems.COOKED_GOAT.get());
        //plant.item(DelightfulItems.COOKED_MARSHMALLOW_STICK.get()); This doesn't really classify as a plant, meat, egg, insect nor fish, and is unhealthy(for animals), so I didn't add it
        meat.item(DelightfulItems.COOKED_VENISON_CHOPS.get());
        meat.item(DelightfulItems.CRAB_RANGOON.get());
        meat.item(DelightfulItems.DELUXE_CHEESEBURGER.get());
        plant.item(DelightfulItems.FIELD_SALAD.get());
        //plant.item(DelightfulItems.GLOW_JELLY_BOTTLE.get()); Same as the marshmallow
        plant.item(DelightfulItems.GREEN_TEA_LEAF.get());
        plant.item(DelightfulItems.HONEY_GLAZED_WALNUT.get()); //I'll count a walnut as a plant.
        //plant.item(DelightfulItems.JELLY_BOTTLE.get()); Same as the glow jelly bottle
        //plant.item(DelightfulItems.MARSHMALLOW_STICK.get()); Same as the cooked marshmallow
        //plant.item(DelightfulItems.MATCHA_ICE_CREAM.get()); Same as marshmallow/glow jelly bottle
        //plant.item(DelightfulItems.NUT_BUTTER_AND_JELLY_SANDWICH.get()); Same as the matcha ice cream
        plant.item(DelightfulItems.NUT_BUTTER_BOTTLE.get()); //I thought of not including this, but it is made of acorns.
        meat.item(DelightfulItems.RAW_GOAT.get());
        //plant.item(DelightfulItems.ROCK_CANDY.get()); Same as the marshmallow
        plant.item(DelightfulItems.SALMONBERRIES.get()); //This is more berry than salmon.
        //plant.item(DelightfulItems.SALMONBERRY_ICE_CREAM.get()); Same as matcha ice cream
        meat.item(DelightfulItems.SINIGANG.get());
        //plant.item(DelightfulItems.SMORE.get()); Same as marshmallow(this is made from marshmallow+some other excluded stuf)
        meat.item(DelightfulItems.VENISON_CHOPS.get());
        plant.item(DelightfulItems.SALMONBERRY_PIE.get(), getPieValue((PieBlock) DelightfulBlocks.SALMONBERRY_PIE.get()));
        plant.item(DelightfulItems.PUMPKIN_PIE_SLICE.get());
        //24/33 added, 9 excluded

        //BYG / BiomesYouGo
        plant.item(BYGItems.BLUEBERRY_PIE.get(), getPieValue((PieBlock) DelightfulBlocks.BLUEBERRY_PIE.get()));
        plant.item(DelightfulItems.BLUEBERRY_PIE_SLICE.get());
        plant.item(BYGItems.CRIMSON_BERRY_PIE.get(), getPieValue((PieBlock) DelightfulBlocks.CRIMSON_BERRY_PIE.get()));
        plant.item(DelightfulItems.CRIMSON_BERRY_PIE_SLICE.get());
        plant.item(BYGItems.GREEN_APPLE_PIE.get(), getPieValue((PieBlock) DelightfulBlocks.GREEN_APPLE_PIE.get()));
        plant.item(DelightfulItems.GREEN_APPLE_PIE_SLICE.get());
        plant.item(BYGItems.NIGHTSHADE_BERRY_PIE.get(), getPieValue((PieBlock) DelightfulBlocks.NIGHTSHADE_BERRY_PIE.get()));
        plant.item(DelightfulItems.NIGHTSHADE_BERRY_PIE_SLICE.get());
        //8/8 added

        //ArsNouveau
        plant.item(ItemsRegistry.SOURCE_BERRY_PIE, getPieValue((PieBlock) DelightfulBlocks.SOURCE_BERRY_PIE.get()));
        plant.item(DelightfulItems.SOURCE_BERRY_PIE_SLICE.get());
        //2/2 added
    }
}
