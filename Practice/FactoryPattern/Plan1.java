package com.Practice.FactoryPattern;

public class Plan1 implements Plan{
    public void getRate(){
        System.out.println("the rate is 1000");
    }

    public void build(){
        System.out.println("Building Plan 1");
    }
}
