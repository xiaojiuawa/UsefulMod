package com.xiaojiu_faith.client;

import com.xiaojiu_faith.Server.ServerProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy  extends ServerProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
