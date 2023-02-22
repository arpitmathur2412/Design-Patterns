package com.CreationalDesignPattern.Phone;

public class Shop {
    public static void main(String[] args) {
        Phone newphone = new PhoneBuilder().setOS("IOS").setBattery("5000 mAh").setProcessor("A-15").setRAM(12).setScreensize(6.1f).getPhone();
        System.out.println(newphone);
    }
}