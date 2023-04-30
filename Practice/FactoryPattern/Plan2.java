package com.Practice.FactoryPattern;

public class Plan2 implements Plan{
    public void getRate(){
        System.out.println("Cost is 2000");
    }
    public void build(){
        System.out.println("building plan 2");
    }
}
