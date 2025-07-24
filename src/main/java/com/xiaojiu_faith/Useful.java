package com.xiaojiu_faith;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static com.xiaojiu_faith.Useful.*;

@Mod(modid = MODID , name = MODNAME , version = version)
public class Useful {
    public static final String MODID = "usefulMod";
    public static final String MODNAME = "UsefulMod";
    public static final String version = "0.0.1";

    @Mod.Instance(MODID)
    public static Useful instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // TODO
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // TODO
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // TODO
    }
}
