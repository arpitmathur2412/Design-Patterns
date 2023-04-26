package com.Structural_Design_Pattern.FacadePattern;

public class Waiter {
    static Ingredient ingredient = new Ingredient();

    public static String getFood(FoodType foodType) {
        switch (foodType) {
            case PIZZA:
                Pizza pizza = new Pizza();
                pizza.prepareFood(ingredient.getPizzaItems());
                return pizza.deliverFood();

            case PASTA:
                Pasta pasta = new Pasta();
                pasta.prepareFood(ingredient.getPastaItems());
                return pasta.deliverFood();
        }
        return null;
    }
}