package com.LvSb.MinFac.datagen;

import com.LvSb.MinFac.setup.Registration;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.FIRSTBLOCK.get(), createStandardTable("firstblock", Registration.FIRSTBLOCK.get()));
        lootTables.put(Registration.FANCYBLOCK.get(), createStandardTable("fancyblock", Registration.FANCYBLOCK.get()));
    }
}
