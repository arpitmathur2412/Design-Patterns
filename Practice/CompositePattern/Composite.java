package com.Practice.CompositePattern;

import java.util.*;
public class Composite implements Component{
    int price;
    private List<Component> components;

    public Composite(int price){
        this.price=price;
        components=new ArrayList<Component>();
    }

    public void showPrice(){
        System.out.println(this.price);
        for(Component c:components){
            c.showPrice();
        }
    }

    public void add(Component component){
        this.components.add(component);
    }

}
