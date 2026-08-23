package com.github.teamfossilsarcheology.fossil_compat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class FoodValueProvider implements DataProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    protected final DataGenerator generator;
    private final Path basePath;
    protected Map<FoodType, FoodAppender> builders;

    protected FoodValueProvider(DataGenerator generator) {
        this.generator = generator;
        this.basePath = generator.getOutputFolder().resolve("data/" + FossilCompat.FOSSIL_MOD_ID + "/food");
        builders = Arrays.stream(FoodType.values()).collect(Collectors.toMap(Function.identity(), FoodAppender::new));
    }

    private Path getPath(FoodType type) {
        return basePath.resolve(type.name().toLowerCase(Locale.ENGLISH) + ".json");
    }

    @Override
    public void run(HashCache cache) throws IOException {
        buildFoodValues();
        builders.forEach((type, foodAppender) -> {
            Path path = getPath(type);
            if (foodAppender.items.isEmpty() && foodAppender.entities.isEmpty()) {
                return;
            }
            JsonObject jsonobject = foodAppender.serializeToJson();
            try {
                String jsonString = GSON.toJson(jsonobject);
                String hash = SHA1.hashUnencodedChars(jsonString).toString();
                if (!Objects.equals(cache.getHash(path), hash) || !Files.exists(path)) {
                    Files.createDirectories(path.getParent());
                    try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
                        bufferedWriter.write(jsonString);
                    }
                }
                cache.putNew(path, hash);
            } catch (IOException var14) {
                LOGGER.error("Couldn't save food values to {}", path, var14);
            }
        });
    }

    protected abstract void buildFoodValues();

    public FoodAppender type(FoodType type) {
        return builders.get(type);
    }

    public static class FoodAppender {
        public static final String BLOCKS = "blocks";
        public static final String ITEMS = "items";
        public static final String ENTITIES = "entities";
        public static final String BLOCK = "block";
        public static final String ITEM = "item";
        public static final String ENTITY = "entity";
        public static final String TAG = "tag";
        public static final String VALUE = "value";
        private final FoodType type;
        private final List<Entry> blocks = new ObjectArrayList<>();
        private final List<Entry> items = new ObjectArrayList<>();
        private final List<Entry> entities = new ObjectArrayList<>();

        public FoodAppender(FoodType type) {
            this.type = type;
        }

        public void blockTag(TagKey<Block> tag, int value) {
            blocks.add(new Entry(tag.location(), value * type.multiplier(), TAG));
        }

        public void itemTag(TagKey<Item> tag) {
            itemTag(tag, -1);
        }

        public void itemTag(TagKey<Item> tag, int value) {
            items.add(new Entry(tag.location(), value, TAG));
        }

        /**
         * Adds the given item to the list without a fixed value. At runtime either the food property of the item or the {@link FoodType#fallback()} value will be used
         */
        public void item(Item item) {
            item(item, -1);
        }

        public void item(ResourceLocation key) {
            item(key, -1);
        }

        /**
         * Adds the given item to the list with the given nutrition multiplied by the {@link FoodType#multiplier()}
         */
        public void item(Item item, int nutrition) {
            item(item, nutrition, type.multiplier());
        }

        public void item(ResourceLocation key, int nutrition) {
            item(key, nutrition, type.multiplier());
        }

        public void item(ResourceLocation key, int nutrition, int multiplier) {
            items.add(new Entry(key, nutrition * multiplier, ITEM));
        }

        public void item(Item item, int nutrition, int multiplier) {
            if (item != Items.AIR) {
                item(Registry.ITEM.getKey(item.asItem()), nutrition, multiplier);
            }
        }


        /**
         * Adds the given block to the list with the given nutrition multiplied by the {@link FoodType#multiplier()}
         */
        public void block(Block block, int nutrition) {
            if (block != Blocks.AIR) {
                block(Registry.BLOCK.getKey(block), nutrition);
            }
        }

        public void block(ResourceLocation key, int nutrition) {
            blocks.add(new Entry(key, nutrition * type.multiplier(), BLOCK));
        }

        public void entityTag(TagKey<EntityType<?>> tag) {
            entities.add(new Entry(tag.location(), -1, TAG));
        }

        /**
         * Adds the given entity to the list without a fixed value. At runtime this value will be calculated based on mob size
         */
        public void entity(EntityType<?> entityType) {
            entity(entityType, -1);
        }

        /**
         * Adds the given entity to the list with the given value
         */
        public void entity(EntityType<?> entityType, int value) {
            entity(Registry.ENTITY_TYPE.getKey(entityType), value);
        }

        /**
         * Adds the given entity to the list with the given value
         */
        public void entity(ResourceLocation location, int value) {
            entities.add(new Entry(location, value, ENTITY));
        }

        public JsonObject serializeToJson() {
            JsonObject root = new JsonObject();
            JsonArray blockArray = new JsonArray();
            JsonArray itemArray = new JsonArray();
            JsonArray entityArray = new JsonArray();
            root.add(BLOCKS, blockArray);
            root.add(ITEMS, itemArray);
            root.add(ENTITIES, entityArray);
            blocks.stream().sorted(FoodAppender::compare).forEach(entry -> blockArray.add(entry.serialize()));
            items.stream().sorted(FoodAppender::compare).forEach(entry -> itemArray.add(entry.serialize()));
            entities.stream().sorted(FoodAppender::compare).forEach(entry -> entityArray.add(entry.serialize()));
            return root;
        }

        private static int compare(Entry one, Entry other) {
            int i = one.id.getNamespace().compareTo(other.id.getNamespace());
            if (i == 0) {
                i = one.id.getPath().compareTo(other.id.getPath());
            }
            return i;
        }

        private record Entry(ResourceLocation id, int value, String key) {
            public JsonObject serialize() {
                JsonObject object = new JsonObject();
                object.addProperty(key, id.toString());
                if (value >= 0) {
                    object.addProperty(VALUE, value);
                }
                return object;
            }
        }
    }
}