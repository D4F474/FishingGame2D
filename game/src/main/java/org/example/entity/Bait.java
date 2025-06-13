package org.example.entity;

import java.util.List;

public class Bait {
    private String name;
    private int effectiveness;
    List<String> fishTarget;
    private float price;

    public Bait(String name, int effectiveness, List<String> fishTarget,float price) {
        this.name = name;
        this.effectiveness = effectiveness;
        this.fishTarget = fishTarget;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(int effectiveness) {
        this.effectiveness = effectiveness;
    }

    public List<String> getFishTarget() {
        return fishTarget;
    }

    public void setFishTarget(List<String> fishTarget) {
        this.fishTarget = fishTarget;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
