package com.dbs;

public class MessageDisplay {
    public static final String DEFAULT_MESSAGE = "Initialized";
    String currentMessage = DEFAULT_MESSAGE;


    public void setDisplayMessage(String message) {
        this.currentMessage = message;
    }


    public String getCurrentMessage() {
        return currentMessage;
    }
}
