package com.Behavioral_Design_Pattern.State_Pattern_2;

public class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Silent State");
    }
}
