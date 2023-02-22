package com.CreationalDesignPattern.AbstractFactory;

public class Oneplus extends Device{
    String ram;
    String processor;

    public Oneplus(){
        this.ram="12gb";
        this.processor="mediatek";
    }

    public Oneplus(String ram,String processor){
        this.ram=ram;
        this.processor=processor;
    }
    @Override
    public String getDetails() {
        return "the ram of oneplus is "+this.ram+" and processor is: "+this.processor;
    }
    public String toString(){
        return "Oneplus[ram: "+this.ram+", processor: "+this.processor+"]";
    }
}
