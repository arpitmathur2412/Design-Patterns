package com.CreationalDesignPattern.AbstractFactory;

public class Lenovo extends Device{
    String ram;
    String processor;
    String gpu;

    public Lenovo(){
        this.ram="16gb";
        this.processor="Intel";
        this.gpu="NVIDIA RTX 3090";
    }

    public Lenovo(String ram,String processor,String Gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=Gpu;
    }
    @Override
    public String getDetails() {
        return "the ram in Lenovo is "+this.ram+", the processor is: "+this.processor+" and the GPU is "+this.gpu;
    }
    public String toString(){
        return "Lenovo[ram: "+this.ram+", processor: "+this.processor+", GPU: "+this.gpu+"]";
    }
}

