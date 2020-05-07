package com.dbs;

public class VendingMachine {
    private final MessageDisplay messageDisplay = new MessageDisplay();
    private final CoinDispenser dispenser = new CoinDispenser();


    public void displayMessage( String message ) {
        messageDisplay.setDisplayMessage(message);
    }


    public String getCurrentlyDisplayedMessage() {
        return messageDisplay.getCurrentMessage();
    }


    public void buyMeButtonPressed(BuyMeButton buyMeButton) {
        //  TODO: This should do something
    }
}
