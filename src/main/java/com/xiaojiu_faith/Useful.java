package com.xiaojiu_faith;

import com.xiaojiu_faith.Server.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static com.xiaojiu_faith.Useful.*;

@Mod(modid = MODID , name = MODNAME , version = version,acceptedMinecraftVersions = "1.7.10")
public class Useful {
    public static final String MODID = "usefulMod";
    public static final String MODNAME = "UsefulMod";
    public static final String version = "0.0.1";

    @Mod.Instance(MODID)
    public static Useful instance;
    @SidedProxy(clientSide = "com.xiaojiu_faith.client.ClientProxy",serverSide ="com.xiaojiu_faith.Server.ServerProxy" )
    public static ServerProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
