package com.Structural_Design_Pattern.DecoratorPattern;

public class DecoraterPatterndemo {
    public static void main(String[] args) {
        Shape circle=new Circle();

        Shape redCircle=new RedShapeDecorator(new Circle());

        Shape redRectangle=new RedShapeDecorator((new Rectangle()));

        System.out.println("circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red ");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
