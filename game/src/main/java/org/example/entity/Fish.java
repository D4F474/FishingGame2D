package org.example.entity;

import com.badlogic.gdx.graphics.Texture;
import org.example.entity.Items.Item;

public class Fish extends Item {
    String name;
    float price;
    Texture texture;

    public Fish(String name, float price, Texture texture) {
        super(name, texture);
        this.name = name;
        this.price = price;
    }

    @Override
    public void useItem(Player player) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
