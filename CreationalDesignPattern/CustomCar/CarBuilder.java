package com.CreationalDesignPattern.CustomCar;

public class CarBuilder {
    private String Color, Engine,Torque,Horsepower;

    public CarBuilder setColor(String color){
        this.Color=color;
        return this;
    }
    public CarBuilder setEngine(String engine){
        this.Engine=engine;
        return this;
    }
    public CarBuilder setTorque(String torque){
        this.Torque=torque;
        return this;
    }
    public CarBuilder setHorsepower(String horsepower){
        this.Horsepower=horsepower;
        return this;
    }
    public Car getCar(){
        return new Car(this.Color,this.Engine,this.Torque,this.Horsepower);
    }
}
