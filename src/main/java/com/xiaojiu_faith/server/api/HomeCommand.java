package com.xiaojiu_faith.server.api;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;

public interface HomeCommand {
    public void sethome(EntityPlayerMP player, ChunkCoordinates location, int dimensionId);
}
