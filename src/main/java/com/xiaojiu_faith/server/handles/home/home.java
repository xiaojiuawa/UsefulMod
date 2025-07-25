package com.xiaojiu_faith.server.handles.home;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;

import java.util.Objects;

public class home {
    private final EntityPlayerMP Player;
    private final ChunkCoordinates HomeLocation;
    private final int dimensionId;
    public home(EntityPlayerMP player,ChunkCoordinates homeLocation,int dimensionId){
        this.Player=player;
        this.HomeLocation=homeLocation;
        this.dimensionId=dimensionId;
    }

    public ChunkCoordinates getHomeLocation() {
        return HomeLocation;
    }

    public int getDimensionId() {
        return dimensionId;
    }

    public EntityPlayer getPlayer() {
        return Player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        home home = (home) o;
        return getDimensionId() == home.getDimensionId() && Objects.equals(getPlayer(), home.getPlayer()) && Objects.equals(getHomeLocation(), home.getHomeLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer(), getHomeLocation(), getDimensionId());
    }
}
