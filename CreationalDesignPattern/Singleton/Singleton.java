package com.CreationalDesignPattern.Singleton;

public class Singleton {
    private static Singleton soleInstance =new Singleton();
    public int i;

    private Singleton(){
        System.out.println("wait ...created");
    }
    public static Singleton getInstance(){
        return soleInstance;
    }
    public int getI(){
        return i;
    }
    public static void setSoleInstance(Singleton soleInstance){
        Singleton.soleInstance=soleInstance;
    }
    public void setI(int i){
        this.i=i;
    }

}
