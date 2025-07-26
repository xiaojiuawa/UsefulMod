package com.xiaojiuFaith.server.commands.home;

import com.xiaojiuFaith.server.handles.HomeHandle;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;

import java.util.ArrayList;
import java.util.List;

public class sethome extends CommandBase {
    public static final String name = "sethome";
    @Override
    public String getCommandName() {
        return name;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length>0){
            EntityPlayerMP player =  CommandBase.getCommandSenderAsPlayer(sender);
            ChunkCoordinates location = player.getPlayerCoordinates();
            int dimensionId =  sender.getEntityWorld().provider.dimensionId;
            HomeHandle.handle.addHome(player.getPersistentID(),location,dimensionId,args[0]);

        }
    }
    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args){
        return new ArrayList<String>();
    }
}
