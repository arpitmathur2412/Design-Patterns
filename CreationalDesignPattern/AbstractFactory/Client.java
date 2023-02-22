package com.CreationalDesignPattern.AbstractFactory;


public class Client {
    public static void main(String[] args) {
        Device dell =
                FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getDevice(DeviceType.Lenovo);
        System.out.println(dell.getDetails());
        Device op =
                FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getDevice(DeviceType.Apple);
        System.out.println(op.getDetails());
    }
}