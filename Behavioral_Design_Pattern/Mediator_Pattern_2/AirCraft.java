package com.Behavioral_Design_Pattern.Mediator_Pattern_2;

abstract class AirCraft {
    protected ATCMediator mediator;
    protected String name;

    public AirCraft(ATCMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}