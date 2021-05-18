package com.LvSb.MinFac.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class hexamineFuelItem extends Item {
    public hexamineFuelItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 300;
    }
}
