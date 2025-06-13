package org.example.entity.Visual;

import com.badlogic.gdx.graphics.Texture;

public class Textures {

    private Texture background;
    private Texture border;
    private Texture hero;
    private Texture water;
    private Texture sales;
    private Texture Beer;
    private Texture Boots;
    private Texture Bread;
    private Texture Inventory;
    private Texture fishingRod;
    private Texture fishDest;
    private Texture shop;

    public Textures(){
        this.background = new Texture("assets/background.png");
        this.hero = new Texture("assets/hero.png");
        this.border = new Texture("assets/wall.png");
        this.water = new Texture("assets/water.png");
        this.sales = new Texture("assets/sales.png");
        this.Beer = new Texture("assets/beer.png");
        this.Boots = new Texture("assets/boots.png");
        this.Bread = new Texture("assets/Bread.png");
        this.Inventory = new Texture("assets/Inventory.png");
        this.fishingRod = new Texture("assets/fishingRod.png");
        this.fishDest = new Texture("assets/fishDest.png");
        this.shop = new Texture("assets/shop.png");
    }

    public Texture getBackground() {
        return background;
    }

    public Texture getBorder() {
        return border;
    }

    public Texture getHero() {
        return hero;
    }

    public Texture getWater() {
        return water;
    }

    public Texture getSales() {
        return sales;
    }

    public Texture getBeer() {
        return Beer;
    }

    public Texture getBoots() {
        return Boots;
    }

    public Texture getBread() {
        return Bread;
    }

    public Texture getInventory() {
        return Inventory;
    }

    public Texture getFishingRod() {
        return fishingRod;
    }

    public Texture getFishDest() {
        return fishDest;
    }

    public Texture getShop() {
        return shop;
    }
}
