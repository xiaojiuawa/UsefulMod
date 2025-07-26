package com.xiaojiuFaith.server;

import com.xiaojiuFaith.server.commands.home.sethome;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommandLoader {
    public CommandLoader(FMLServerStartingEvent event){
        event.registerServerCommand(new sethome());
    }
}
