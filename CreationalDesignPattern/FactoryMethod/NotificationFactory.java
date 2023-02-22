package com.CreationalDesignPattern.FactoryMethod;

public class NotificationFactory {
    public Notification getType(String channel){
        switch (channel){
            case "SMS":
                return new SMS();
            case "Email":
                return new Email();
            case "Push":
                return new PushNotification();
        }
        return null;
    }
}