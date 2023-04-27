package net.mende1.howtofabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mende1.howtofabric.HowToFabric;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(new Identifier(HowToFabric.MOD_ID))
            .displayName(Text.literal("Tanzanite"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();
}
