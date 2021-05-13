package com.LvSb.MinFac.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HexamineFule extends Item {
    public HexamineFule(Properties properties) {
        super(properties);
    }

   //@Override
    public int getBurtTime(ItemStack itemStack) {
        return 200;
    }
}
