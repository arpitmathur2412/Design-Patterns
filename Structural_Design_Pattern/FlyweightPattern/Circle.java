package com.Structural_Design_Pattern.FlyweightPattern;

public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;


    public Circle(String color){
        this.color=color;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setRadius(int r){
        this.radius=r;
    }
    public void setY(int y){
        this.y=y;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
