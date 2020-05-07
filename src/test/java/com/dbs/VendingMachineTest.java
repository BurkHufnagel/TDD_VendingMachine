package com.dbs;

import junit.framework.TestCase;


public class VendingMachineTest extends TestCase {


   public VendingMachineTest(String name) {
        super(name);
    }


   public void test_displaying_a_message() {
       TestableMessageDisplay display = new TestableMessageDisplay();
       VendingMachine machine = new VendingMachine(display);

       String expectedMessage = "Smoke test";
       machine.displayMessage( expectedMessage );

       String actualMessage = display.getCurrentlyDisplayedMessage();

       assertEquals(expectedMessage, actualMessage);
   }


   class TestableMessageDisplay extends MessageDisplay {
       private String currentlyDisplayedMessage;

       @Override
       public void setDisplayMessage(String message) {
           this.currentlyDisplayedMessage = message;
           super.setDisplayMessage(message);
       }

       String getCurrentlyDisplayedMessage() {
           return currentlyDisplayedMessage;
       }
   }
}
