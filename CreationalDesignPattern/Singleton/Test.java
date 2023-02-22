package com.CreationalDesignPattern.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.setI(5);
        s2.setI(10);
        System.out.println(s1.getI());
        s2.i=s1.i+s2.i;
        System.out.println(s1.getI());
        print("S1",s1);
        print("S1",s2);

    }

    static void print(String name, Singleton obj) {
        System.out.printf("Object:%s, Hashcode:%d%n",name,obj.hashCode());
    }
}