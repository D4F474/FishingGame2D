package org.example.GameEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLoader {

    int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int y;
    public List<List<Character>> readMapData(String pathOfMap){
        int lineOfMap = 0;
        List<List<Character>> map = new ArrayList<>();
        try{

        File myObj = new File(pathOfMap);
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            map.add(new ArrayList<>());
            for(int i =0; i<data.length(); i++){
                map.get(lineOfMap).add(data.charAt(i));
                if(data.charAt(i) == 'P'){
                    y=lineOfMap;
                    x=i;
                }
            }
            lineOfMap++;
        }
        myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
        return map;
    }
}
