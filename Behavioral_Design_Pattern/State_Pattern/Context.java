package com.Behavioral_Design_Pattern.State_Pattern;

public class Context {
    private State state;
    public Context(){
        state=null;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
}
