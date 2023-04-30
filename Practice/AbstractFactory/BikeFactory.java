package com.Practice.AbstractFactory;

public class BikeFactory extends AbstractFactory{


    public Bike getBike(String biketype){
        if(biketype.equalsIgnoreCase("bike1")){
            return new Bike1();
        }
        else if(biketype.equalsIgnoreCase("bike2")){
            return new Bike2();
        }
        return null;
    }

    public Car getCar(String cartype){
        return null;
    }
}
