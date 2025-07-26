package com.xiaojiuFaith.server;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        // TODO
    }

    public void init(FMLInitializationEvent event)
    {
        // TODO
    }
    public void postInit(FMLPostInitializationEvent event)
    {
        // TODO
    }
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event){
        new CommandLoader(event);
    }
}
