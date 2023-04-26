package com.Behavioral_Design_Pattern.Memento_Pattern;
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}