package org.example.entity.Items;

import org.example.entity.Player;

public class Beer extends Item {

    public Beer(String name, int durability, int rarity) {
        super(name, durability, rarity);
    }

    @Override
    public void useItem(Player player) {

    }
}
