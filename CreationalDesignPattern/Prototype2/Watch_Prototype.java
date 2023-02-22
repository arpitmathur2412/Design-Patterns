package com.CreationalDesignPattern.Prototype2;

public class Watch_Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Gshock g1=new Gshock();
        Rolex r1=new Rolex();
        Tag_heuer t1=new Tag_heuer();

        g1.add("gshock1");
        g1.add("gshock2");
        g1.add("gshock3");

        r1.add("rolex1");
        r1.add("rolex2");
        r1.add("rolex3");

        t1.add("tag_h1");
        t1.add("tag_h2");
        t1.add("tag_h3");

        System.out.println(g1.getWatchList());
        System.out.println(r1.getWatchList());
        System.out.println(t1.getWatchList());

        Rolex r2=new Rolex();
        //cloned the prototype
        r2=(Rolex)r1.clone();
        //modified the prototype
        r2.add("rolex_new");
        System.out.println(r2.getWatchList());

    }
}
