package com.Behavioral_Design_Pattern.State_Pattern_3;

public class YellowState implements State{

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(this);
    }
    public String toString() {
        return "YELLOW LIGHT";
    }
}
