package org.example.GameEngine;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.example.entity.Items.Bread;
import org.example.entity.Items.Item;
import org.example.entity.Player;
import org.example.entity.Visual.Textures;

import java.util.EventListener;
import java.util.List;
import java.util.Scanner;

public class Game implements ApplicationListener {

    public static final int INVENTORY_HEIGHT = 11;
    public static final int INVENTORY_WIDTH = 15;
    public static final String VISUAL_MAP = "src/main/resources/assets/map.txt";
    public static final String MOVEMENT_MAP = "src/main/resources/assets/movementMap.txt";

    private Player player;
    private String userInput;
    private MapLoader mapLoader;
    private InputFromUser inputFromUser;
    private Textures textures;
    private SpriteBatch batch;
    private Sprite sprite;
    boolean isInventoryVisible;
    public Game() {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void create() {
        textures = new Textures();
        FileLoader fl = new FileLoader();
        List<List<Character>> visualMap = fl.readMapData(VISUAL_MAP);
        List<List<Character>> movementMap = fl.readMapData(MOVEMENT_MAP);
        this.player = new Player("NPC", fl.getX(), fl.getY());
        this.mapLoader = new MapLoader(visualMap, movementMap);
        Item bread = new Bread("Hlqb", 5, 1);
        player.addItemToInventory(bread);
        inputFromUser = new InputFromUser(mapLoader, player);
        batch = new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {

    }

    void showInventory(){
        for(int i = 7; i<INVENTORY_HEIGHT; i++){
            for(int j =9; j< INVENTORY_WIDTH; j++){
                float x = j * 32;
                float y = (15 - 1 - i ) * 32;
                batch.draw(textures.getInventory(), x, y, 32, 32);

            }
        }
        player.openInventory();
    }

    @Override
    public void render() {
        inputFromUser.movementPlayer();
        if(Gdx.input.isKeyJustPressed(Input.Keys.I)){
            isInventoryVisible = !isInventoryVisible;
        }
        batch.begin();
        this.mapLoader.DrawMap(textures, batch);
        if(isInventoryVisible){
            showInventory();
        }
        batch.end();
    }



    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}