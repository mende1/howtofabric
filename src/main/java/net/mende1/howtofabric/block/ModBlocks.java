package net.mende1.howtofabric.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mende1.howtofabric.HowToFabric;
import net.mende1.howtofabric.item.ModItemGroup;
import net.mende1.howtofabric.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block CITRINE_BLOCK = registerBlock(
            "citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.CITRINE
    );
    public static final Block CITRINE_ORE = registerBlock(
            "citrine_ore",
            new ExperienceDroppingBlock(
                    FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)
            ),
            ModItemGroup.CITRINE
    );
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock(
            "deepslate_citrine_ore",
            new ExperienceDroppingBlock(
                    FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)
            ),
            ModItemGroup.CITRINE
    );

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(
          Registries.BLOCK,
          new Identifier(HowToFabric.MOD_ID, name),
          block
        );
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(
            Registries.ITEM,
            new Identifier(HowToFabric.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings())
        );
        ModItems.addToItemGroup(group, item);

        return item;
    }

    public static void registerModBlocks() {
        HowToFabric.LOGGER.debug("Registering ModBlocks for " + HowToFabric.MOD_ID);
    }
}
