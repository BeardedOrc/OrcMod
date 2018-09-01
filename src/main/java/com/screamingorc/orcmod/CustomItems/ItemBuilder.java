package com.screamingorc.orcmod.CustomItems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

class ItemBuilder {

    public ItemStack createItem(Material material, String name, ArrayList<String> description, int quantity) {

        ItemStack item = new ItemStack(material, quantity);

        // Create item meta data

        // Set display name for item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);

        // Create Lore
        ArrayList<String>lore = new ArrayList<String>();
        for (int i = 0; i < description.size(); i++) {
            String s = description.get(i);
            lore.add(s);
        }
        meta.setLore(lore);

        // Hide Vanilla tooltips
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);

        // Set custom item meta
        item.setItemMeta(meta);

        //Return custom item
        return item;
    }
}
