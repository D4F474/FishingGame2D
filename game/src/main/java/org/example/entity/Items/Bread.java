package org.example.entity.Items;

import org.example.entity.Player;

public class Bread extends Item {


    public Bread(String name, int durability, int rarity) {
        super(name, durability, rarity);
    }

    @Override
    public void useItem(Player player) {

    }
}
