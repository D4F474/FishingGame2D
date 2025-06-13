package org.example.GameEngine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.example.entity.Player;

public class InputFromUser {
    private MapLoader mapLoader;
    private Player player;


    public InputFromUser(MapLoader mapLoader, Player player) {
        this.mapLoader = mapLoader;
        this.player = player;
    }

    public void movementPlayer(){

        float speed = 7.3f;
        float deltaTime = Gdx.graphics.getDeltaTime();

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            this.player.moveUp(speed, deltaTime);
            if(!this.mapLoader.moveInMap((int)player.getX(), (int)player.getY())){
                player.moveDown(speed, deltaTime);
            }
        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            this.player.moveDown(speed, deltaTime);
            if(!this.mapLoader.moveInMap((int)player.getX(), (int)player.getY())){
                player.moveUp(speed, deltaTime);
            }
        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            this.player.moveLeft(speed, deltaTime);
            if(!this.mapLoader.moveInMap((int)player.getX(), (int)player.getY())){
                player.moveRight(speed, deltaTime);
            }
        }

        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            this.player.moveRight(speed, deltaTime);
            if(!this.mapLoader.moveInMap((int)player.getX(), (int)player.getY())){
                player.moveLeft(speed, deltaTime);
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.F)){

        }
    }

    public void catchFish(){

        }

}
