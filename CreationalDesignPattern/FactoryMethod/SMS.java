package com.CreationalDesignPattern.FactoryMethod;

public class SMS implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notification sent");
    }
}
