package org.example.entity.NPCTypes;

public class Seller extends NPCManager {
    public Seller() {
        super("Seller", 9, 17);
    }

    @Override
    public void interact() {
        System.out.println("Hello what do you want to sell you?");
    }
}
