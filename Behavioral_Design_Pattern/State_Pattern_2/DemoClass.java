package com.Behavioral_Design_Pattern.State_Pattern_2;

public class DemoClass {
    public static void main(String[] args) {
        AlertStateContext stateContext=new AlertStateContext();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();

    }
}
