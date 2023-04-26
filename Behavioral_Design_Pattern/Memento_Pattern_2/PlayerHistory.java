package com.Behavioral_Design_Pattern.Memento_Pattern_2;

import java.util.Stack;
public class PlayerHistory {
    private final Stack<PlayerMemento> mementos = new Stack<>();

    public void save(PlayerMemento memento) {
        mementos.push(memento);
    }

    public PlayerMemento undo() {
        return mementos.pop();
    }
}
