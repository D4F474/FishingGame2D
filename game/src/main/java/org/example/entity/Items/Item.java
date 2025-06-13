package org.example.entity.Items;

import com.badlogic.gdx.graphics.Texture;
import org.example.entity.Player;

public abstract class Item {
    private String name;
    private int durability;
    private int rarity;
    private Texture texture;
    public Item(String name, Texture texture){
        this.name = name;
        this.texture = texture;
    }

    public Item(String name, int durability, int rarity, Texture texture) {
        this.name = name;
        this.durability = durability;
        this.rarity = rarity;
        this.texture = texture;
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

    public Texture getTexture() {
        return texture;
    }
}
