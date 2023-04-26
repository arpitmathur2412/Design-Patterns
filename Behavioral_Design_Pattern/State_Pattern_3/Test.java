package com.Behavioral_Design_Pattern.State_Pattern_3;

public class Test {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setState(new RedState());
        trafficLight.getState();
        trafficLight.setState(new GreenState());
        trafficLight.getState();
        trafficLight.setState(new YellowState());
        trafficLight.getState();
    }
}
