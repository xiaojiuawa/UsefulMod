package com.xiaojiuFaith.server.api;

import com.xiaojiuFaith.server.commands.home.Home;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;

import java.util.List;
import java.util.UUID;

public interface HomeCommand {
    public boolean addHome(UUID Playeruuid, ChunkCoordinates location, int dimensionId, String HomeName);
    public String conveyToHome(EntityPlayerMP Player, String homeName);
    public List<Home> GetHome(UUID Playeruuid);
}
