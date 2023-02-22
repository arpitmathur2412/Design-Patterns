package com.CreationalDesignPattern.OsFactory;

public class OsaFactory {
    public Os getOs(String msg){
        if(msg.equalsIgnoreCase("open")){
            return new Android();
        }
        else if(msg.equalsIgnoreCase("closed")){
            return new Ios();
        }
        else if(msg.equalsIgnoreCase("unused")){
            return new Windows();
        }
        return null;
    }
}
