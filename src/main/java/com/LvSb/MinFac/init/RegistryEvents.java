package com.LvSb.MinFac.init;

import com.LvSb.MinFac.lists.BlockList;
import com.LvSb.MinFac.lists.FluidList;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.LvSb.MinFac.Main.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    //Register Blocks
    //TODO Move to RegisterBlock Class
    @SubscribeEvent
    public static void RegisterFluid(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.oil = new FlowingFluidBlock(() -> FluidList.oil, Block.Properties
                        .create(Material.WATER)
                        .doesNotBlockMovement()
                        .noDrops())
                        .setRegistryName("oil")
        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
