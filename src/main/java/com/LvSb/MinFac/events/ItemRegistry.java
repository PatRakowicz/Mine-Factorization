package com.LvSb.MinFac.events;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.init.ModItemGroup;
import com.LvSb.MinFac.lists.BlockList;
import com.LvSb.MinFac.lists.ItemList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {

    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    //Register the items that are in ItemList and BlockList
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                ItemList.creative_menu_list = new Item(new Item.Properties().group(ModItemGroup.MOD_ITEM_GROUP))
                        .setRegistryName(location("creativeItemList")),

                // Add Items
                ItemList.new_egg = new Item(new Item.Properties().group(ModItemGroup.MOD_ITEM_GROUP))
                        .setRegistryName(location("new_egg")),

                ItemList.hexamine = new Item(new Item.Properties().group(ModItemGroup.MOD_ITEM_GROUP))
                        .setRegistryName(location("hexamine")),

                //Add Block Item
                ItemList.hexamine_ore = new BlockItem(BlockList.BLOCKS, new Item.Properties()
                        .group(ModItemGroup.MOD_ITEM_GROUP))
                        .setRegistryName(BlockList.BLOCKS.getRegistryName())
        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
