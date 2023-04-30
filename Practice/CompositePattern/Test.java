package com.Practice.CompositePattern;

public class Test {
    public static void main(String[] args) {
        Component pc=new Composite(10000);
        Component cpu=new Leaf(500);
        Component ram=new Leaf(1000);
        pc.add(cpu);
        pc.add(ram);
        pc.showPrice();
    }
}