package org.example.GameEngine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.example.entity.FishManager;
import org.example.entity.NPCTypes.Buyer;
import org.example.entity.NPCTypes.Fisher;
import org.example.entity.NPCTypes.Seller;
import org.example.entity.Visual.Textures;

import java.util.List;

public class MapLoader {

    private List<List<Character>> visualMap;
    private List<List<Character>> movementMap;
    private int oldX, oldY;
    private FishManager fishManager;
    private char position = ' ';
    private boolean stepOnObject = false;
    private Buyer buyer;
    private Seller seller;
    private Fisher fisher;

    public MapLoader(List<List<Character>> visualMap,List<List<Character>> movement) {
        this.visualMap = visualMap;
        this.movementMap = movement;
        this.fishManager = new FishManager();
        this.buyer = new Buyer();
        this.seller = new Seller();
        this.fisher = new Fisher();
    }

    public void DrawMap(Textures textures,SpriteBatch batch){
        for (int i = 0; i< visualMap.size(); i++) {
            for(int j = 0; j< visualMap.get(i).size(); j++){
                float x = j* 32;
                float y = (visualMap.size() - 1 - i) * 32;
                switch(visualMap.get(i).get(j)){
                    case ' ':
                        batch.draw(textures.getBackground(), x, y, 32, 32);
                        break;
                    case '#':
                        batch.draw(textures.getBorder(), x, y, 32, 32);
                        break;
                    case 'W':
                        batch.draw(textures.getWater(), x, y, 32, 32);
                        break;
                    case 'S':
                        batch.draw(textures.getSales(), x,y, 32,32);
                        break;
                    case 'F':
                        batch.draw(textures.getFishDest(), x, y, 32, 32);
                        break;
                    case 'B':
                        batch.draw(textures.getShop(),x,y, 32,32);
                        break;
                }
            }
        }
        for (int i = 0; i< movementMap.size(); i++) {
            for(int j = 0; j< movementMap.get(i).size(); j++) {
                    if(movementMap.get(i).get(j) == 'P'){
                        float x = j* 32;
                        float y = (movementMap.size() - 1 - i) * 32;
                        batch.draw(textures.getBackground(), x, y, 32, 32);
                        batch.draw(textures.getHero(), x, y, 32, 32);
                        this.oldX = j; this.oldY = i;
                    }
                }
            }
    }

    public boolean moveInMap(int x, int y){
        if(movementMap.get(y).get(x) != '#'){
            switch(visualMap.get(y).get(x)){
                case 'S':

                        System.out.println("Selling fish!");

                        break;
                    case 'F':
                        System.out.println("Fishing...");
                    break;
                    case 'B':
                        System.out.println("Buy some beer!");
                    break;
            }
            movementMap.get(this.oldY).set(this.oldX, ' ');
            movementMap.get(y).set(x, 'P');
            this.oldX = x; this.oldY = y;
            return true;
        }
        return false;
    }

    public boolean checkIfNearInteraction(int x, int y){


        return false;
    }

    public List<List<Character>> getVisualMap() {
        return visualMap;
    }
}
/*
* if(loadedMap.get(y).get(x) != ' '){
                stepOnObject = true;
                position = loadedMap.get(y).get(x);
            }
            if(stepOnObject){
                loadedMap.get(this.oldY).set(this.oldX, ' ');
                stepOnObject = false;
                System.out.println(position);
            }else{
                loadedMap.get(this.oldY).set(this.oldX, position);
            }
            loadedMap.get(this.oldY).set(this.oldX, ' ');
            loadedMap.get(y).set(x, 'P');
            this.oldX = x; this.oldY = y;
            return true;
* */