package com.LvSb.MinFac.init;

import com.LvSb.MinFac.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {

    //create constructor for the item group
    private final Supplier<ItemStack> iconSupplier;

    //switch to public if breaks
    private ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Main.MOD_ID,
            () -> new ItemStack(Items.LIGHT_BLUE_BANNER));
}
