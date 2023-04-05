package com.Structural_Design_Pattern.FlyweightPattern2;

public class BookingDesk {
    private static final String[] tickettype = {"Infant","Adult","Senior"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            FlightTicket ticket=(FlightTicket) TicketFactory.getTicket(getRandomtype());
            ticket.setSeat(getSeat());
            ticket.setName("Arpit Mathur");
            ticket.printTicket();
        }
    }
    private static String getRandomtype() {
        return tickettype[(int)(Math.random()*tickettype.length)];
    }

    private static int getSeat() {
        return (int)(Math.random()*100);
    }

}