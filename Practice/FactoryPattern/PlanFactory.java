package com.Practice.FactoryPattern;

public class PlanFactory {

    public Plan getPlan(String plantype){
        if(plantype.equalsIgnoreCase("Plan1")){
            return new Plan1();
        }
        else if(plantype.equalsIgnoreCase("Plan2")){
            return new Plan2();
        }
        else if(plantype.equalsIgnoreCase("Plan3")){
            return new Plan3();
        }
        return null;
    }
}
