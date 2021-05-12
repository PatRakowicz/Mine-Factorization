package com.LvSb.MinFac.lists;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.init.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

    //Create block w/ spawnable Item
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> HEXAMINE_ORE = BLOCKS.register("hexamine_ore",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.0F, 1.0F)));

    //Create block w/o spawnable Item
    public static final DeferredRegister<Block> NO_ITEM_BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);


}
