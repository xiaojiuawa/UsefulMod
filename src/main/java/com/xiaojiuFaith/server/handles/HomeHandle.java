package com.xiaojiuFaith.server.handles;

import com.xiaojiuFaith.Useful;
import com.xiaojiuFaith.server.api.HomeCommand;
import com.xiaojiuFaith.server.commands.home.Home;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.Teleporter;

import java.util.*;

import static com.xiaojiuFaith.Useful.homes;

public class HomeHandle implements HomeCommand {
    public static final HomeHandle handle = new HomeHandle();

    @Override
    public boolean addHome(UUID Playeruuid, ChunkCoordinates location, int dimensionId, String HomeName) {
        if (!homes.containsKey(Playeruuid)){
            homes.put(Playeruuid,new HashMap<String, Home>());
        }
        homes.get(Playeruuid).put(HomeName,new Home(Playeruuid,location,dimensionId,HomeName));
        return true;
    }

    @Override
    public String conveyToHome(EntityPlayerMP player, String homeName) {
        UUID Playeruuid = player.getPersistentID();
        Map<String, Home> homes = Useful.homes.get(Playeruuid);
        if (!homes.containsKey(homeName)) return I18n.format("xiaojiu_faith.error.CannotFindHome");
        Home home = homes.get(homeName);
        if (player.getEntityWorld().provider.dimensionId==home.getDimensionId()){
            player.playerNetServerHandler.setPlayerLocation(home.getHomeLocation().posX,home.getHomeLocation().posY,home.getHomeLocation().posZ,0,0);
        }else{
            if (home.getDimensionId()==1){
                if (home.getDimensionId()==0){
                    player.mcServer.getConfigurationManager().transferPlayerToDimension(player,-1);
                }else{
                    player.mcServer.getConfigurationManager().transferPlayerToDimension(player,0);
                }
            }
//            player.mcServer.worldServerForDimension(home.getDimensionId()).getBlock(home.getHomeLocation().posX,home.getHomeLocation().posY,home.getHomeLocation().posZ);
            player.mcServer.getConfigurationManager().transferPlayerToDimension(player, home.getDimensionId());
            player.playerNetServerHandler.setPlayerLocation(home.getHomeLocation().posX,home.getHomeLocation().posY,home.getHomeLocation().posZ,0,0);

        }
        return homeName;
    }

    @Override
    public List<Home> GetHome(UUID Playeruuid) {
        List<Home> homes1 =new ArrayList<Home>();
        for (Map.Entry<String, Home> entry : homes.get(Playeruuid).entrySet()) {
            homes1.add(entry.getValue());
        }
        return homes1;
    }
}
