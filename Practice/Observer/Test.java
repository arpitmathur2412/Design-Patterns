package com.Practice.Observer;

public class Test {
    public static void main(String[] args) {
        Channel channel1=new Channel("code with harry");
        Subscriber s1=new Subscriber();
        Subscriber s2=new Subscriber();
        channel1.addUser(s1);
        channel1.addUser(s2);

        channel1.addVideo("java with harry");
    }
}
