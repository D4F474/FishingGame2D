package org.example.entity.Items;

import com.badlogic.gdx.graphics.Texture;
import org.example.entity.Player;

public class Beer extends Item {

    public Beer(String name, int durability, int rarity, Texture texture) {
        super(name, durability, rarity, texture);
    }

    @Override
    public void useItem(Player player) {

    }
}
