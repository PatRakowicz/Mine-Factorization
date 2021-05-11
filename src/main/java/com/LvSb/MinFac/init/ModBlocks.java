package com.LvSb.MinFac.init;

import com.LvSb.MinFac.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 */

public final class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

    // Add Blocks Below | Use First as template
    public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore", () ->
            new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F,3.0F)));

}