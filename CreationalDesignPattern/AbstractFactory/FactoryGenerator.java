package com.CreationalDesignPattern.AbstractFactory;

public abstract class FactoryGenerator extends AbstractDeviceFactory{

    public static AbstractDeviceFactory getFactory(FactoryType ftype){
        switch (ftype){
            case LAPTOPFACTORY :
                return new LaptopFactory();

            case MOBILEFACTORY :
                return new MobileFactory();
        }
        return null;
    }
}
