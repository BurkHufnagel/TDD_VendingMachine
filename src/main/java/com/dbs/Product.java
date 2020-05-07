package com.dbs;

public enum Product {
    GUM(20), GRANOLA_BAR(80), CANDY_BAR(100);

    private final int price;

    Product( int price ) {
        this.price = price;
    }


    int getPrice() {
        return this.price;
    }
}
