package com.Practice.Memento;

public class Test {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        originator.setState("State 1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator.getSate());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println(originator.getSate());
    }
}
