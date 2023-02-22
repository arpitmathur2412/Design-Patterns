package com.Structural_Design_Pattern.FacadePattern2;

public class Economy implements Ticket{

    String ticketdetails;

    @Override
    public void bookTicket(String departure, String arrival,String seatdetails) {
        ticketdetails="Ticket booked from "+departure +" to "+ arrival+" in Economy Class with "+seatdetails+".";
    }

    @Override
    public String getTicket() {
        return ticketdetails;
    }
}
