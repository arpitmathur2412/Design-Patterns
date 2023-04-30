package com.Practice.AbstractFactory;

public class FactoryGenerator {

    public AbstractFactory getFactory(String factorytype){
        if(factorytype.equalsIgnoreCase("bikefactory")){
            return new BikeFactory();
        }
        else if (factorytype.equalsIgnoreCase("carfactory")){
            return new CarFactory();
        }
        return null;
    }
}
