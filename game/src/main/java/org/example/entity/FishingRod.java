package org.example.entity;

public abstract class FishingRod {

    protected String name;
    protected int durability;
    protected int range;
    protected boolean baitAttached;

    public abstract void cast();

    public abstract void pull();

    public abstract boolean isBroken();

    public void attachBait(Bait bait) {
        this.baitAttached = true;
    }

    public void reduceDurability(float amount) {
        this.durability -= amount;
    }

}
