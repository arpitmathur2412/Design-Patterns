package com.CreationalDesignPattern.FactoryMethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push notification sent");
    }
}
