package com.Structural_Design_Pattern.FacadePattern2;

public class Website {
    static Benefits benefits=new Benefits();

    public static String bookFlight(String dep,String arr,TicketType ticketType){
        switch (ticketType){
            case FIRST:
                First first=new First();
                first.bookTicket(dep,arr,benefits.getFirstClass());
                return first.getTicket();

            case ECONOMY:
                Economy economy=new Economy();
                economy.bookTicket(dep,arr,benefits.getEconomyClass());
                return economy.getTicket();

            case BUSINESS:
                Business business=new Business();
                business.bookTicket(dep,arr,benefits.getBusinessClass());
                return business.getTicket();
        }
        return null;
    }
}
