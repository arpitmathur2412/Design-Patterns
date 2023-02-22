package com.CreationalDesignPattern.Phone;

public class Phone {
    private String OS, processor,battery;
    private int RAM;
    private float screensize;
    public Phone(String OS, int RAM, String processor, float screensize, String battery) {
        this.OS = OS;
        this.processor = processor;
        this.screensize = screensize;
        this.RAM = RAM;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "PHONE [ OS: " + this.OS + ", RAM: " + this.RAM + ", Processor: " + this.processor + ", Screen-size: " + this.screensize + ", Battery: " + this.battery+" ]";
    }
}