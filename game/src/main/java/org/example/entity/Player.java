package org.example.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.example.entity.Items.Item;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String name;
    private int hungry;
    private int thirsty;
    private float x;
    private float y;
    private boolean isInteraction = false;

    private Map<Item, Integer> inventory;

    public Player() {
    }

    public Player(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public boolean isInteraction() {
        return isInteraction;
    }

    public void moveUp(float speed, float deltaTime){
        y = y - speed * deltaTime;
    }

    public void moveDown(float speed, float deltaTime){
        y = y + speed * deltaTime;
    }
    public void moveLeft(float speed, float deltaTime){
        x = x - speed * deltaTime;
    }
    public void moveRight(float speed, float deltaTime){
        x = x + speed * deltaTime;
    }

    public void openInventory(SpriteBatch batch, float x, float y){
        for(Item item : this.inventory.keySet()){
            System.out.println("Predi towa");
            System.out.println(item.getName());
            batch.draw(item.getTexture(),x,y,32,32);
            System.out.println("Sled tova");
        }
    }

    public void addItemToInventory(Item item){
        if(!this.inventory.containsKey(item)){
            this.inventory.put(item, 1);
        }else{
            this.inventory.compute(item, (i, v)-> v + 1);
        }
    }

    public void interaction(){
        this.isInteraction = !this.isInteraction;
    }
}
