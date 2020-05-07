package com.dbs;

public enum Coin {
    NICKEL(5),
    DIME(10),
    QUARTER(25),
    DOLLAR(100);

    private final int value;

    private Coin(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
