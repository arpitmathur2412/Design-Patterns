package com.CreationalDesignPattern.AbstractFactory;

public class Hp extends Device{
    String ram;
    String processor;
    String gpu;

    public Hp(){
        this.ram="12gb";
        this.processor="Intel";
        this.gpu="NVIDIA RTX 4090";
    }

    public Hp(String ram,String processor,String Gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=Gpu;
    }
    @Override
    public String getDetails() {
        return "the ram in HP is "+this.ram+", the processor is: "+this.processor+" and the GPU is "+this.gpu;
    }
    public String toString(){
        return "HP[ram: "+this.ram+", processor: "+this.processor+", GPU: "+this.gpu+"]";
    }
}
