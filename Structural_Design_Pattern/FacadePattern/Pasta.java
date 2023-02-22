package com.Structural_Design_Pattern.FacadePattern;

public class Pasta implements Food{
    String prepareditems;

    @Override
    public void prepareFood(String ingredientList) {
        prepareditems="Pasta is created with ingredients-"+ingredientList;
    }

    @Override
    public String deliverFood() {
        return prepareditems;
    }
}
