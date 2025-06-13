package org.example.entity.Items.FishingRodTypes;

import org.example.entity.FishingRod;

public class BasicRod extends FishingRod {

    public BasicRod(){
        super();
        this.durability =100;
        this.range = 10;
        this.baitAttached = false;
    }

    @Override
    public void cast() {

    }

    @Override
    public void pull() {

    }

    @Override
    public boolean isBroken() {
        return false;
    }
}
