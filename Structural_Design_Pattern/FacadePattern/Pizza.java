package com.Structural_Design_Pattern.FacadePattern;

public class Pizza implements Food{
    String prepareditems;

    @Override
    public void prepareFood(String ingredientList) {
        prepareditems="Pizza is created with ingredients -"+ingredientList;
    }

    @Override
    public String deliverFood() {
        return prepareditems;
    }
}