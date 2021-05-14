package com.LvSb.MinFac.lists;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.init.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);


    public static final RegistryObject<Item> CREATIVE_MENU_LIST = ITEMS.register("creative_menu_list",
            () -> new Item(new Item.Properties().group(ModItemGroup.MINFAC_TAB)));

    public static final RegistryObject<Item> NEW_EGG = ITEMS.register("new_egg",
            () -> new Item(new Item.Properties().group(ModItemGroup.MINFAC_TAB)));
    
    public static final RegistryObject<Item> REFINED_HEXAMITE = ITEMS.register("refined_hexamite",
            () -> new Item(new Item.Properties().group(ModItemGroup.MINFAC_TAB)));

    public static final RegistryObject<Item> MANURE = ITEMS.register("manure",
            () -> new Item(new Item.Properties().group(ModItemGroup.MINFAC_TAB)));

}
