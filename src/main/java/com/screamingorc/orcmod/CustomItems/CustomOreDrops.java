package com.screamingorc.orcmod.CustomItems;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class CustomOreDrops extends ItemBuilder{

    public ItemStack denseCarbon(int quantity) {

        Material material = Material.COAL;
        String name = (ChatColor.AQUA + "Dense Carbon" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
           description.add("Needed more time to become a jewel");
           description.add("Maybe you should have waited longer.");
        description.add("You can use this as fuel in a furnace");

        return createItem(material, name, description, quantity);
    }

    public ItemStack diamondOre(int quantity) {

        Material material = Material.DIAMOND_ORE;
        String name = (ChatColor.AQUA + "Diamond Ore" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
        description.add("This may be refined into");
        description.add("a diamond through the smelting process");

        return createItem(material, name, description, quantity);
    }

    public ItemStack perfectDiamond(int quantity) {

        Material material = Material.COAL;
        String name = (ChatColor.AQUA + "Perfect Diamond" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
        description.add("A pristine diamond suitable");
        description.add("for holding rare enchantments.");

        return createItem(material, name, description, quantity);
    }

    public ItemStack emeraldStone(int quantity) {

        Material material = Material.STONE;
        String name = (ChatColor.AQUA + "Emerald Colored Stone" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
        description.add("It might have looked like an emerald");
        description.add("but it was not.");

        return createItem(material, name, description, quantity);
    }

    public ItemStack emeraldOre(int quantity) {

        Material material = Material.EMERALD_ORE;
        String name = (ChatColor.AQUA + "Emerald Ore" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
        description.add("This may be refined into");
        description.add("an emerald through the smelting process");

        return createItem(material, name, description, quantity);
    }

    public ItemStack perfectEmerald(int quantity) {

        Material material = Material.EMERALD;
        String name = (ChatColor.AQUA + "Perfect Emerald" + ChatColor.RESET);
        ArrayList<String> description = new ArrayList<String>();
        description.add("A pristine emerald suitable");
        description.add("for holding common enchantments.");

        return createItem(material, name, description, quantity);
    }


}
