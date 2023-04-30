package com.Practice.Iterator_Pattern;

public class Test {
    public static void main(String[] args) {
        NameRepository nr=new NameRepository();


        for(Iterator iterator=(Iterator) nr.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
