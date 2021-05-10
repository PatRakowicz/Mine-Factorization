package com.LvSb.MinFac;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public final class Main {

    //TODO Figure out how to add more items with this Main.java

    public static final String MODID = "minfac";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {
        LOGGER.debug("hello From MineFac");
    }
}
