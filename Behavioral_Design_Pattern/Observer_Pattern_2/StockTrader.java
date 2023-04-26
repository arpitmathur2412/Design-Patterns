package com.Behavioral_Design_Pattern.Observer_Pattern_2;

class StockTrader implements StockObserver {
    private String name;

    public StockTrader(String name) {
        this.name = name;
    }

    public void update(Stock stock) {
        System.out.println("Stock trader " + name + " received update: " + stock.getName() + " is now priced at " + stock.getPrice());
    }
}