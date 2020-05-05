package com.dbs;

import junit.framework.TestCase;


public class VendingMachineTest extends TestCase {


   public VendingMachineTest(String name) {
        super(name);
    }


   public void test_displaying_a_message() {
       VendingMachine machine = new VendingMachine();

       String expectedMessage = "Smoke test";
       machine.displayMessage( expectedMessage );

       String actualMessage = machine.getCurrentlyDisplayedMessage();

       assertEquals(expectedMessage, actualMessage);
   }
}
