package com.Behavioral_Design_Pattern.Memento_Pattern_2;

// ORIGINATOR CLASS
public class Player {
    private int health;
    private int level;

    public Player(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PlayerMemento save() {
        return new PlayerMemento(health, level);
    }

    public void restore(PlayerMemento memento) {
        this.health = memento.getHealth();
        this.level = memento.getLevel();
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", level=" + level +
                '}';
    }
}
