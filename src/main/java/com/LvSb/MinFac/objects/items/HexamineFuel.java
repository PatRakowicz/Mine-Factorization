package com.LvSb.MinFac.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HexamineFuel extends Item {
    public HexamineFuel(Properties properties) {
        super(properties);
    }

   //@Override
    public int getBurtTime(ItemStack itemStack) {
        return 200;
    }
}
