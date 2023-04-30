package com.Practice.FactoryPattern;

public class Test {
    public static void main(String[] args) {
        PlanFactory planFactory=new PlanFactory();

        Plan plan1=planFactory.getPlan("Plan1");
        Plan plan2=planFactory.getPlan("Plan2");
        Plan plan3=planFactory.getPlan("Plan3");

        plan1.getRate();
        plan1.build();

        plan2.getRate();
        plan2.build();

        plan3.getRate();
        plan3.build();
    }
}
