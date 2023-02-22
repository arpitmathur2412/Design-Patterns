package com.Structural_Design_Pattern.CompositePattern2;
import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPerformance();
}

class leaf implements Component{

    String name,data;
    @Override
    public void showPerformance() {
        System.out.println(name+" : "+data);
    }

    public leaf(String name, String data) {
        super();
        this.name = name;
        this.data = data;
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
    public void showPerformance() {
        System.out.println(name);
        for(Component c:components){
            c.showPerformance();
        }
    }
}


