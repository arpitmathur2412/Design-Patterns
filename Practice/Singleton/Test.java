package com.Practice.Singleton;

public class Test {
    public static void main(String[] args) {
        ErrorManager e1=ErrorManager.getInstance();
        ErrorManager e2=ErrorManager.getInstance();

        e1.addError("error1");
        e2.addError("error2");

        e1.getErrors();
        e2.getErrors();

    }
}
