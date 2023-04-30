package net.mende1.howtofabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mende1.howtofabric.block.ModBlocks;
import net.mende1.howtofabric.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CITRINE_BLOCK);

        oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE);
        oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE);
    }
}
