package com.dbs;

public class BuyMeButton {
    private VendingMachine vendingMachine;
    private boolean isEnabled = false;


    public BuyMeButton(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    boolean isEnabled() {
        return isEnabled;
    }


    public void enable() {
        isEnabled = true;
    }


    public void disable() {
        isEnabled = false;
    }

    public void pressed() {
        if(isEnabled) {
            vendingMachine.buyMeButtonPressed(this);
        }
    }
}
