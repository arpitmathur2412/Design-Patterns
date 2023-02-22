package com.CreationalDesignPattern.OsFactory;

public class newPhone {
    public static void main(String[] args) {
        OsaFactory osf=new OsaFactory();
        osf.getOs("open").spec();
    }
}

