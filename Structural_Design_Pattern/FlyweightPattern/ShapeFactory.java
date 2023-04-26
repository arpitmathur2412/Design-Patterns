package com.Structural_Design_Pattern.FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circlemap=new HashMap<String, Circle>();

    public static Shape getCircle(String color){
        Circle circle= circlemap.get(color);

        if(circle==null){
            circle=new Circle(color);
            circlemap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}