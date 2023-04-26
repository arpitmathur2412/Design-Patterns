package com.Behavioral_Design_Pattern.State_Pattern_3;

public class RedState implements State {
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(this);
    }

    public String toString() {
        return "RED LIGHT";
    }
}