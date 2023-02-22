package com.CreationalDesignPattern.CustomCar;

public class Car {
    private String Color, Engine,Torque,Horsepower;

    public Car(String color,String engine,String torque, String horsepower){
        this.Color=color;
        this.Engine=engine;
        this.Torque=torque;
        this.Horsepower=horsepower;
    }
    public String toString(){
        return "Car [ Color: " + this.Color +", Engine: " + this.Engine + ", Torque: " + this.Torque + ", Horsepower: " + this.Horsepower + " ]";
    }
}
