package com.Practice.CompositePattern;

public class Leaf implements Component {
    int price;

    public Leaf(int price){
        this.price=price;
    }
    public void showPrice(){
        System.out.println(this.price);
    }

    @Override
    public void add(Component c) {
    }

}
