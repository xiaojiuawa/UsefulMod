package com.xiaojiuFaith.server.commands.home;

import net.minecraft.util.ChunkCoordinates;

import java.util.Objects;
import java.util.UUID;

public class Home {
    private final UUID Player;
    private final String HomeName;
    private final ChunkCoordinates HomeLocation;
    private final int dimensionId;
    public Home(UUID player, ChunkCoordinates homeLocation, int dimensionId, String homeName){
        this.Player=player;
        this.HomeLocation=homeLocation;
        this.dimensionId=dimensionId;
        this.HomeName=homeName;
    }

    public ChunkCoordinates getHomeLocation() {
        return HomeLocation;
    }

    public int getDimensionId() {
        return dimensionId;
    }

    public UUID getPlayer() {
        return Player;
    }

    public String getHomeName() {
        return HomeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return getDimensionId() == home.getDimensionId() && Objects.equals(getPlayer(), home.getPlayer()) && Objects.equals(getHomeName(), home.getHomeName()) && Objects.equals(getHomeLocation(), home.getHomeLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer(), getHomeName(), getHomeLocation(), getDimensionId());
    }
}
