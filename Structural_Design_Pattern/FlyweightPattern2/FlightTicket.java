package com.Structural_Design_Pattern.FlyweightPattern2;

public class FlightTicket implements Ticket {
    String type,name;
    int seat;

    public FlightTicket(String type){
        this.type=type;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSeat(int seat) {
        this.seat=seat;
    }

    @Override
    public void printTicket() {
        System.out.println("Ticket [ Name: "+name+" Seat: "+seat+" Type: "+type);
    }
}
