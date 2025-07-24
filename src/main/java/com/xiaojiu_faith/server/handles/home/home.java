package com.xiaojiu_faith.server.handles.home;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;

import java.util.Objects;

public class home {
    private EntityPlayer Player;
    private ChunkCoordinates HomeLocation;

    public ChunkCoordinates getHomeLocation() {
        return HomeLocation;
    }

    public EntityPlayer getPlayer() {
        return Player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        home home = (home) o;
        return Objects.equals(Player, home.Player) && Objects.equals(HomeLocation, home.HomeLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Player, HomeLocation);
    }
}
