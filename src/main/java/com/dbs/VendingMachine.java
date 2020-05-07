package com.dbs;

public class VendingMachine {
    private MessageDisplay messageDisplay;


    public VendingMachine(MessageDisplay messageDisplay) {
        this.messageDisplay = messageDisplay;
    }


    public void displayMessage( String message ) {
        messageDisplay.setDisplayMessage(message);
    }


    public void buyMeButtonPressed(BuyMeButton buyMeButton) {
        //  Needs to do something
    }
}