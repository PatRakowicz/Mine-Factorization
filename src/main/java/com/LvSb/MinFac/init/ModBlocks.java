package com.LvSb.MinFac.init;

import com.LvSb.MinFac.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

    // Add Blocks Below | Use First as template
    public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore", () ->
            new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F,3.0F)));
}
