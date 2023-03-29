package com.Structural_Design_Pattern.AdapterPattern2;

public class FrenchInterpretor implements AdvancedLanguageInterpretor{
    @Override
    public void interpretFrench(String sign) {
        System.out.println("Interpreting french:"+sign);
    }

    @Override
    public void interpretGerman(String sign) {

    }
}
