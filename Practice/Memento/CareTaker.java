package com.Practice.Memento;

import java.util.*;
public class CareTaker {
    private List<Memento> mementolist=new ArrayList<>();


    public void add(Memento state){
        mementolist.add(state);
    }

    public Memento get(int index){
        return mementolist.get(index);
    }
}