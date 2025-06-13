package org.example.entity.Items;

import org.example.entity.Player;

public abstract class Item {
    private String name;
    private int durability;
    private int rarity;

    public Item(String name, int durability, int rarity) {
        this.name = name;
        this.durability = durability;
        this.rarity = rarity;
    }

    public abstract void useItem(Player player);

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public int getRarity() {
        return rarity;
    }
}
