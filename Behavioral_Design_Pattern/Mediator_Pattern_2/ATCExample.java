package com.Behavioral_Design_Pattern.Mediator_Pattern_2;

public class ATCExample {
    public static void main(String[] args) {
        ATCMediator mediator = new ATCControl();

        Flight flight1 = new Flight(mediator, "Flight 1");
        Flight flight2 = new Flight(mediator, "Flight 2");
        Flight flight3 = new Flight(mediator, "Flight 3");

        mediator.addAirCraft(flight1);
        mediator.addAirCraft(flight2);
        mediator.addAirCraft(flight3);

        flight1.send("Flight 1 is requesting landing clearance.");
        flight2.send("Flight 2, this is Flight 1. We have received landing clearance.");
    }
}