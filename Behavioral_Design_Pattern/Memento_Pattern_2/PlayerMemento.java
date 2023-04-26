package com.Behavioral_Design_Pattern.Memento_Pattern_2;

// Memento class
public class PlayerMemento {
    private int health;
    private int level;

    public PlayerMemento(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
