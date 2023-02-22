package com.Structural_Design_Pattern.FacadePattern;

import java.sql.SQLOutput;

public class Customer {
    public static void main(String[] args) {
        Ingredient ingredients=new Ingredient();
        Pizza pizza=new Pizza();
        String pizzaitems=ingredients.getPizzaItems();
        pizza.prepareFood(pizzaitems);
        System.out.println(pizza.deliverFood());


        System.out.println("----------FACADE---------");
        System.out.println(Waiter.getFood(FoodType.PIZZA));
    }
}
