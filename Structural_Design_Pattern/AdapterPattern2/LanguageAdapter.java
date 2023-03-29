package com.Structural_Design_Pattern.AdapterPattern2;

public class LanguageAdapter implements LanguageInterpretor{
    AdvancedLanguageInterpretor ali;

    public LanguageAdapter(String sign) {
        if (sign.equalsIgnoreCase("german")) {
            ali = new GermanInterpretor();
        } else if (sign.equalsIgnoreCase("french")) {
            ali = new FrenchInterpretor();
        }
    }
    @Override
    public void interpret(String language,String sign) {
        if(sign.equalsIgnoreCase("french")){
            ali.interpretFrench(language);
        }
        else if (sign.equalsIgnoreCase("german")){
            ali.interpretGerman(language);
        }
    }
}
