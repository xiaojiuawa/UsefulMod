package com.xiaojiu_faith.server.commands.home;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

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
    public void processCommand(ICommandSender sender, String[] args) {

    }
    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args){

        return null;
    }
}
