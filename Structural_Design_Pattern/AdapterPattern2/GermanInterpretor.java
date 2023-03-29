package com.Structural_Design_Pattern.AdapterPattern2;

public class GermanInterpretor implements AdvancedLanguageInterpretor{
    @Override
    public void interpretFrench(String sign) {

    }

    @Override
    public void interpretGerman(String sign) {
        System.out.println("Interpreting German:"+sign);
    }
}
