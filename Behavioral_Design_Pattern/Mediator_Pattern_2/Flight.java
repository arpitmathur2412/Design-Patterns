package com.Behavioral_Design_Pattern.Mediator_Pattern_2;


class Flight extends AirCraft {
    public Flight(ATCMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending message: " + msg);
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
}