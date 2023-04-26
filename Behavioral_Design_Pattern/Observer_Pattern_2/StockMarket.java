package com.Behavioral_Design_Pattern.Observer_Pattern_2;

public class StockMarket {
    public static void main(String[] args) {
        Stock apple = new Stock("Apple", 145.00);
        Stock google = new Stock("Google", 2375.50);

        StockTrader trader1 = new StockTrader("Trader 1");
        StockTrader trader2 = new StockTrader("Trader 2");

        apple.addObserver(trader1);
        apple.addObserver(trader2);

        google.addObserver(trader2);

        apple.setPrice(150.00);
        google.setPrice(2400.00);

        apple.removeObserver(trader2);

        apple.setPrice(155.00);
        google.setPrice(2450.00);
    }
}