package com.CreationalDesignPattern.Prototype;
import java.util.ArrayList;
import java.util.*;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList=new ArrayList<String>();

    }
    public Vehicle(List<String> list){
        this.vehicleList=list;
    }
    public List<String> getVehicleList() {
        return this.vehicleList;
    }
    public List<String> add(String car){
        Vehicle temp=new Vehicle();
        temp.vehicleList=this.vehicleList;
        temp.vehicleList.add(car);
        return temp.vehicleList;
    }

    public String modify(){
        return (String)this.vehicleList.get(0);
    }
//    public List<String> remove() {
//
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        List<String> l=this.getVehicleList();
        Vehicle temp=new Vehicle();
        temp.vehicleList=l;
        return temp;
    }

}
