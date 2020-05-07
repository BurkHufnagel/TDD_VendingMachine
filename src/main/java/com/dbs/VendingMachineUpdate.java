package com.dbs;

public class VendingMachineUpdate {
    private String displayedMessage;
    private CoinDispenser dispenser = new CoinDispenser();


    public void coinInserted(Coin coin) {
          dispenser.insertCoin( coin );
    }


    public int getBalance(){
        return dispenser.getAmountHeld();
    }


    public void displayMessage( String message ) {
        this.displayedMessage = message;
    }


    public String getCurrentlyDisplayedMessage() {
        return displayedMessage;
    }


    public int coinReturnPressed() {
        int amountHeld = dispenser.getAmountHeld();
        int amountReturned = dispenser.returnAmount( amountHeld );
        return amountReturned;
    }

    public void buyMeButtonPressed(BuyMeButton buyMeButton) {
        //  Needs to do something
    }
}
