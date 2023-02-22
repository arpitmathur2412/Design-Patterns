package com.Structural_Design_Pattern.CompositePattern;

public class CompositeTest {
    public static void main(String[] args) {

        Component hd=new leaf(4000,"HDD");
        Component mouse=new leaf(4000, "Mouse");
        Component monitor=new leaf(8000,"Monitor");
        Component ram=new leaf(6000,"RAM");
        Component cpu=new leaf(9000,"CPU");

        Composite ph=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite mb=new Composite("MotherBoard");
        Composite computer=new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);


        ph.addComponent(mouse);
        ph.addComponent(monitor);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

        computer.showPrice();

    }
}
