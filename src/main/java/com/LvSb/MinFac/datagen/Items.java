package com.LvSb.MinFac.datagen;

import com.LvSb.MinFac.Main;
import com.LvSb.MinFac.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.MAGICBLOCK_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(Main.MODID, "item/magicblock_item"));
        singleTexture(Registration.FIRSTITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(Main.MODID, "item/firstitem"));
        withExistingParent(Registration.FIRSTBLOCK_ITEM.get().getRegistryName().getPath(), new ResourceLocation(Main.MODID, "block/firstblock"));
    }
}
