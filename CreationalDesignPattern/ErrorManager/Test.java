package com.CreationalDesignPattern.ErrorManager;

public class Test {
    public static void main(String[] args) {
        ErrorManager e1 = ErrorManager.getInstance();
        ErrorManager e2 = ErrorManager.getInstance();

        e1.addError("IllegalAccessError");
        e2.addError("InstantiationError");

        System.out.println(e1.getErrors());

    }
}
