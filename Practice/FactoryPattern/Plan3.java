package com.Practice.FactoryPattern;

public class Plan3 implements Plan{
    public void getRate(){
        System.out.println("the rate is 3000");
    }
    public void build(){
        System.out.println("building plan 3");
    }
}
