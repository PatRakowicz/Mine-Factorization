package com.LvSb.MinFac.lists;

import com.LvSb.MinFac.init.RegistryEvents;
import com.LvSb.MinFac.objects.fluid.FluidOil;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;

public class FluidList {

    public static FluidOil.Source oil = null;
    public static FluidOil.Flowing flowing_oil = null;

    public static class Tags {
        public static final Tag<Fluid> OIL = new FluidTags.Wrapper(RegistryEvents.location("oil"));
    }
}
