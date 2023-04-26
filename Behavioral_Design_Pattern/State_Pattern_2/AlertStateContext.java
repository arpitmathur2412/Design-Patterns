package com.Behavioral_Design_Pattern.State_Pattern_2;

public class AlertStateContext {
    private MobileAlertState currentstate;
    public AlertStateContext(){
        currentstate=new Ringing();
    }
    public void setState(MobileAlertState state){
        currentstate=state;
    }
    public void alert(){
        currentstate.alert();
    }
}
