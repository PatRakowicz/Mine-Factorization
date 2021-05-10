package com.LvSb.MinFac;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

import java.util.logging.LogManager;


@Mod(Main.MODID)
public final class Main {

    public static final String MODID = "minfac";
    public static final Logger LOGGER = (Logger) LogManager.getLogManager().getLogger(MODID);

    public Main () {
        LOGGER.debug("Hello From Mine Factorization!")
    }
}
