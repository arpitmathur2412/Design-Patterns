package com.Structural_Design_Pattern.DecoratorPattern2;

public class Cafe {
    public static void main(String[] args) {
        Coffee coffee=new BasicCoffee();
        Coffee customizedcoffee=new CoffeeDecorator(coffee);
        System.out.println(customizedcoffee.getDescription()+": "+ customizedcoffee.getCost());
    }
}