package org.example.entity;

import com.badlogic.gdx.graphics.Texture;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FishManager {

    private Random r;
    private List<Fish> fishesh;
    File fileRead;
    public FishManager(){
        r = new Random();
        fishesh = new ArrayList<>();
        loadData();
    }

    public void loadData(){
        try{
            System.out.println("I work proper!");
            this.fileRead = new File("src/main/resources/assets/fishesh.txt");
            Scanner sc = new Scanner(fileRead);
            while(sc.hasNextLine()){
                StringBuilder fishName = new StringBuilder();
                StringBuilder priceStr = new StringBuilder();
                String data = sc.nextLine();
                System.out.println("Data " + data);
                for(int i =0; i<data.length(); i++){
                    if(data.charAt(i) >= 'a' && data.charAt(i) <= 'z'){
                        fishName.append(data.charAt(i));
                    }else if (data.charAt(i) != '/'){
                        priceStr.append(data.charAt(i));
                    }
                }
                float price = Float.parseFloat(priceStr.toString());
                fishesh.add(new Fish(fishName.toString(), price, new Texture("assets/"+fishName.toString()+".png")));
            }
        }catch (IOException e){

        }
    }

    public Fish getFish(){
        int n = this.r.nextInt(this.fishesh.size());
        return this.fishesh.get(n);
    }
}
