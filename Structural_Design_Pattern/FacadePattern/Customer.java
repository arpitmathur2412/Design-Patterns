package com.Structural_Design_Pattern.FacadePattern;

import java.sql.SQLOutput;

public class Customer {
    public static void main(String[] args) {

//      without implementing facade
        System.out.println("-----WITHOUT FACADE---");
        Ingredient ingredients=new Ingredient();
        Pizza pizza=new Pizza();
        String pizzaitems=ingredients.getPizzaItems();
        pizza.prepareFood(pizzaitems);
        System.out.println(pizza.deliverFood());

//      implementing facade
        System.out.println("----------FACADE---------");
        System.out.println(Waiter.getFood(FoodType.PIZZA));
    }
}
