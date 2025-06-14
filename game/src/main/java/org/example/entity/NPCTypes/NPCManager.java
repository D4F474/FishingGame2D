package org.example.entity.NPCTypes;

public abstract class NPCManager {
    private String Name;
    private int x, y;
    protected boolean interacted = false;

    public NPCManager(String name, int x, int y) {
        Name = name;
        this.x = x;
        this.y = y;
    }

    public abstract void interact();

    public String getName() {
        return Name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isInteracted() {
        return interacted;
    }

    public void changeInteractBool(){
        this.interacted = !this.interacted;
    }
}
