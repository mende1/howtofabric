package net.mende1.howtofabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mende1.howtofabric.HowToFabric;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE = registerItemGroups("Citrine Item Group", ModItems.CITRINE);

    public static ItemGroup registerItemGroups(String groupName, Item item) {
        return FabricItemGroup.builder(new Identifier(HowToFabric.MOD_ID))
                .displayName(Text.literal(groupName))
                .icon(() -> new ItemStack(item))
                .build();
    }
}
