package com.Structural_Design_Pattern.DecoratorPattern2;

public class CoffeeDecorator implements Coffee{

    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost()+ 100;
    }

    public   String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }
}
