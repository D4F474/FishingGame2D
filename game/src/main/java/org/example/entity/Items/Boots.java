package org.example.entity.Items;

import org.example.entity.Player;

public class Boots extends Item {
    public Boots(String name, int durability, int rarity) {
        super(name, durability, rarity);
    }

    @Override
    public void useItem(Player player) {

    }
}
