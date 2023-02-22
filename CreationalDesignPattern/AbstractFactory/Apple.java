package com.CreationalDesignPattern.AbstractFactory;

public class Apple extends Device{
    String ram;
    String processor;

    public Apple(){
        this.ram="12gb";
        this.processor="mediatek";
    }

    public Apple(String ram,String processor){
        this.ram=ram;
        this.processor=processor;
    }
    @Override
    public String getDetails() {
        return "the ram of Apple is "+this.ram+" and processor is: "+this.processor;
    }
    public String toString(){
        return "Apple[ram: "+this.ram+", processor: "+this.processor+"]";
    }
}

