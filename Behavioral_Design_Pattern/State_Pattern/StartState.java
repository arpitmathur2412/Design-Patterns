package com.Behavioral_Design_Pattern.State_Pattern;

public class StartState implements State{
    public void doAction(Context context){
        System.out.println("player is in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
