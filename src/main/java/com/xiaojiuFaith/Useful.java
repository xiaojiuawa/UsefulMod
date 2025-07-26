package com.xiaojiuFaith;

import com.xiaojiuFaith.server.CommonProxy;
import com.xiaojiuFaith.server.commands.home.Home;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.xiaojiuFaith.Useful.*;

@Mod(modid = MODID , name = MODNAME , version = version,acceptedMinecraftVersions = "1.7.10")
public class Useful {
    public static final String MODID = "usefulMod";
    public static final String MODNAME = "UsefulMod";
    public static final String version = "0.0.1";
    public static Map<UUID, Map<String, Home>> homes = new HashMap<UUID, Map<String, Home>>();

    @Mod.Instance(MODID)
    public static Useful instance;
    @SidedProxy(
            clientSide = "com.xiaojiuFaith.client.ClientProxy",
            serverSide = "com.xiaojiuFaith.server.CommonProxy" )
    public static CommonProxy proxy;
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
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event){
        proxy.serverStarting(event);
    }
}
