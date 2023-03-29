package com.Structural_Design_Pattern.DecoratorPattern;

public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;

    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
