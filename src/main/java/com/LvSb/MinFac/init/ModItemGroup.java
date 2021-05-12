package com.LvSb.MinFac.init;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {

    public static final ItemGroup MINFAC_TAB = new ModItemGroup(Main.MOD_ID, () -> new ItemStack(ItemList.CREATIVE_MENU_LIST.get()));
    private final Supplier<ItemStack> iconSupplier;

    private ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
