package com.Practice.AbstractFactory;

public class CarFactory extends AbstractFactory {
    public Car getCar(String cartype){

        if(cartype.equalsIgnoreCase("car1")){
            return new Car1();
        }
        else if(cartype.equalsIgnoreCase("car2")){
            return new Car2();
        }
        return null;
    }

    public Bike getBike(String biketype){
        return null;
    }
}
