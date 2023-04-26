package com.Behavioral_Design_Pattern.Mediator_Pattern_2;

import java.util.ArrayList;
import java.util.List;

class ATCControl implements ATCMediator {
    private final List<AirCraft> airCrafts;

    public ATCControl() {
        this.airCrafts = new ArrayList<>();
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        this.airCrafts.add(airCraft);
    }

    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft ac : this.airCrafts) {
            // Send message to all aircraft except the sender
            if (ac != airCraft) {
                ac.receive(msg);
            }
        }
    }
}
