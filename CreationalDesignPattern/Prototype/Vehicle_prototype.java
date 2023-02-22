package com.CreationalDesignPattern.Prototype;

public class Vehicle_prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a=new Vehicle();
        a.add("Rolls Royce Cullinan");
        a.add("Mclaren p1");
        a.add("Mercedes S-class Maybach");
        a.add("Nissan GTR");
        a.add("Bentley Continental GT");

        System.out.println(a.getVehicleList());
        Vehicle b=new Vehicle();
        b= (Vehicle) a.clone();
        System.out.println(b.getVehicleList());
        System.out.println(b.modify());
    }
}
