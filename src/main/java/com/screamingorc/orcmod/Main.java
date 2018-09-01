package com.screamingorc.orcmod;

import com.screamingorc.orcmod.BlockBreakMod.OreBreakEventClass;
import com.screamingorc.orcmod.BlockPlaceMod.OrePlaceEventClass;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "OrcMod " + ChatColor.WHITE + "has been " + ChatColor.GREEN + "ENABLED");
        getServer().getPluginManager().registerEvents(new OreBreakEventClass(), this);
        getServer().getPluginManager().registerEvents(new OrePlaceEventClass(), this);
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "OrcMod " + ChatColor.WHITE + "has been " + ChatColor.RED + "DISABLED");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
