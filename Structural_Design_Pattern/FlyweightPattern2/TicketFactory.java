package com.Structural_Design_Pattern.FlyweightPattern2;

import java.util.HashMap;

public class TicketFactory {
    private static final HashMap<String, Ticket> ticketmap=new HashMap<String, Ticket>();

    public static Ticket getTicket(String type){
        FlightTicket ticket= (FlightTicket) ticketmap.get(type);
        if(ticket==null){
            ticket=new FlightTicket(type);
            ticketmap.put(type,ticket);
            System.out.println("Booking seat of type: " + type);
        }
        return ticket;
    }
}
