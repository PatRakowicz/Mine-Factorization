package com.LvSb.MinFac.objects.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HexamineFuel extends Item {

    public HexamineFuel(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 300;
    }
}
