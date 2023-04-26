package com.Structural_Design_Pattern.DecoratorPattern2;

public class BasicCoffee implements Coffee{
    public int getCost() {
        return 200;
    }

    public String getDescription() {
        return "Basic Coffee";
    }
}
