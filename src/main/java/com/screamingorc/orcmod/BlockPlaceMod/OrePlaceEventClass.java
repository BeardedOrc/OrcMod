package com.screamingorc.orcmod.BlockPlaceMod;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;
import java.util.UUID;

public class OrePlaceEventClass implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {

        Block block = event.getBlock();
        Player player = event.getPlayer();

        ArrayList<Material> nonPlace = new ArrayList<Material>();
        nonPlace.add(Material.DIAMOND_ORE);
        nonPlace.add(Material.EMERALD_ORE);
        nonPlace.add(Material.IRON_ORE);
        nonPlace.add(Material.GOLD_ORE);

        if (player.getGameMode() == GameMode.SURVIVAL) if (!player.hasPermission("OrcOrePlaceModBypass.all"))
            for (Material material : nonPlace)
                if (material.equals(block.getType())) {
                    player.sendMessage(ChatColor.RED + "Ore blocks can not be placed.  They can only be smelted");
                    event.setCancelled(true);
                }
}}
