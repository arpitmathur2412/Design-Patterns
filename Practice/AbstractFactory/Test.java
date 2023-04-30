package com.Practice.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        FactoryGenerator factoryGenerator=new FactoryGenerator();
        AbstractFactory af=factoryGenerator.getFactory("carfactory");
        af.getCar("car2").price();
    }

}
