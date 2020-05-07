package com.dbs;

public class MessageDisplay {
    String currentMessage = "";


    public void setDisplayMessage(String message) {
        this.currentMessage = message;
    }


    public String getCurrentMessage() {
        return currentMessage;
    }
}
