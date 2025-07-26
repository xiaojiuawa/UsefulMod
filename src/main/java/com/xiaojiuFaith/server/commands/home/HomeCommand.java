package com.xiaojiuFaith.server.commands.home;

import com.xiaojiuFaith.server.handles.HomeHandle;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class HomeCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "home";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (!(sender instanceof EntityPlayerMP)) return;
        EntityPlayerMP player = CommandBase.getCommandSenderAsPlayer(sender);
        if (args.length==0){
            player.addChatComponentMessage(new ChatComponentText(HomeHandle.handle.GetHome(player.getUniqueID()).toString()));
        }else{
            HomeHandle.handle.conveyToHome(player,args[0]);
        }


    }
}
