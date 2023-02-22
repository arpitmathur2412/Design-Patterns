package com.Structural_Design_Pattern.FacadePattern2;


public class Customer {
    public static void main(String[] args) {
        System.out.println(Website.bookFlight("Mumbai","Ahmedabad",TicketType.ECONOMY));
    }
}
