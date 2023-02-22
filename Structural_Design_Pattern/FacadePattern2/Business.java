package com.Structural_Design_Pattern.FacadePattern2;

public class Business implements Ticket{
    String ticketdetails;

    @Override
    public void bookTicket(String departure, String arrival,String seatdetails) {
        ticketdetails="Ticket booked from "+departure +" to "+ arrival+" in Business Class with "+seatdetails;
    }

    @Override
    public String getTicket() {
        return ticketdetails;
    }

}
