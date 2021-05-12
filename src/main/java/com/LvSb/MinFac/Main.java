package com.LvSb.MinFac;

import com.LvSb.MinFac.init.ModItemGroup;
import com.LvSb.MinFac.lists.BlockList;
import com.LvSb.MinFac.lists.ItemList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main {

    public static final String MOD_ID = "minfac";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Main instance;

    public Main() {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        ItemList.ITEMS.register(modEventBus);
        BlockList.BLOCKS.register(modEventBus);
        BlockList.NO_ITEM_BLOCK.register(modEventBus);
    }

    //Register the block items
    @SubscribeEvent
    public static void createBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(ModItemGroup.MINFAC_TAB);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
