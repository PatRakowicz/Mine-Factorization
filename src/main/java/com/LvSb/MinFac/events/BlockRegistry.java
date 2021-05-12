package com.LvSb.MinFac.events;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.lists.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    //register a block with events
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                //create new blocks here
                BlockList.BLOCKS = new Block(Block.Properties.create(Material.ROCK)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(1.0F, 1.0F))
                        .setRegistryName("hexamine_ore")
        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
