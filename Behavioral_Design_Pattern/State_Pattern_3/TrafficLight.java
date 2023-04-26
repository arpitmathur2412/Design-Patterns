package com.Behavioral_Design_Pattern.State_Pattern_3;

public class TrafficLight {
    private State currentState;

    public TrafficLight() {
        this.currentState = new GreenState();
    }

    public void setState(State state) {
        this.currentState = state;
    }
    public void getState() {
        System.out.println("Current state: " + currentState.toString());
    }
}
