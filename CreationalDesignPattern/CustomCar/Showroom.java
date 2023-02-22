package com.CreationalDesignPattern.CustomCar;

public class Showroom {
    public static void main(String[] args) {
        Car newCar=new CarBuilder().setColor("Starry-Blue").setEngine("1.8L TSI").setHorsepower("180 bHp").setTorque("250N/m").getCar();
        System.out.println(newCar);
    }
}
