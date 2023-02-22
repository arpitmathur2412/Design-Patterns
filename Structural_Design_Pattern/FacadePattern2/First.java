package com.Structural_Design_Pattern.FacadePattern2;

public class First implements Ticket{
    String ticketdetails;

    @Override
    public void bookTicket(String departure, String arrival,String seatdetails) {
        ticketdetails="Ticket booked from "+departure +" to "+ arrival+" in First Class with "+seatdetails;
    }


    @Override
    public String getTicket() {
        return ticketdetails;
    }
}
