package com.CreationalDesignPattern.FactoryMethod;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        notificationFactory.getType("SMS").notifyUser();
        notificationFactory.getType("Email").notifyUser();
        notificationFactory.getType("Push").notifyUser();
    }
}
