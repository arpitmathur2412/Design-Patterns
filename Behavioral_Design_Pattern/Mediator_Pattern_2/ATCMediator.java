package com.Behavioral_Design_Pattern.Mediator_Pattern_2;

interface ATCMediator {
    public void sendMessage(String msg, AirCraft airCraft);
    public void addAirCraft(AirCraft airCraft);
}
