package com.Structural_Design_Pattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

class leaf implements Component{
    int price;
    String name;
    @Override
    public void showPrice() {
        System.out.println(name+" :" +price);
    }

    public leaf(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }
}

class Composite implements Component{
    String name;
    List<Component> components=new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c:components){
            c.showPrice();
        }
    }
}
public class ComputerPart {
}
