package com.screamingorc.orcmod.BlockBreakMod;

import com.screamingorc.orcmod.CustomItems.CustomOreDrops;
import com.screamingorc.orcmod.Main;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class OreBreakEventClass implements Listener {
    private Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onBreak(BlockBreakEvent event) {

        Block block = event.getBlock();
        Player player = event.getPlayer();
        Location location = block.getLocation();

        if (player.getGameMode() == GameMode.SURVIVAL) {

            if (!player.hasPermission("OrcOreBreakModBypass.all")) {

                if (!player.hasPermission("OrcOreBreakModBypass.diamond")) {
                    if (block.getType().equals(Material.DIAMOND_ORE)) {

                        block.setType(Material.AIR);

                        double chancePercent = Math.random();
                        if(chancePercent >= 0 && chancePercent <= 0.7) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().denseCarbon(1));
                        }
                        else if (chancePercent >= 0.71 && chancePercent < 1) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().diamondOre(1));
                        }
                        else if (chancePercent == 1) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().perfectDiamond(1));
                        }

                        event.setCancelled(true);
                    }
                }

                if (!player.hasPermission("OrcOreBreakModBypass.emerald")) {
                    if (block.getType().equals(Material.EMERALD_ORE)) {

                        block.setType(Material.AIR);

                        double chancePercent = Math.random();
                        if(chancePercent >= 0 && chancePercent <= 0.7) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().emeraldStone(1));
                        }
                        else if (chancePercent >= 0.71 && chancePercent < 1) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().emeraldOre(1));
                        }
                        else if (chancePercent == 1) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new CustomOreDrops().perfectEmerald(1));
                        }

                        event.setCancelled(true);
                    }
                }

                if (!player.hasPermission("OrcOreBreakModBypass.dirt")) {
                    if (block.getType().equals(Material.DIRT)) {

                        block.setType(Material.AIR);

                        double chancePercent = Math.random();
                        if (chancePercent >= 0 && chancePercent <= 0.3) {
                            block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GLOWSTONE_DUST, 1));
                        }
                        block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.DIRT, 1));

                        event.setCancelled(true);
                    }
                }
            }


        }

    }
}
