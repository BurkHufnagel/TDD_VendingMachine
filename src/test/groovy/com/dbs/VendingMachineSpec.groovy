package com.dbs

import spock.lang.Specification


class VendingMachineSpec extends Specification {

    // A Spock version of the JUnit test in VendingMachineTest.java
    def "The message returned by the display should be the same as the message sent to the dislpay"() {
        given: "an instance of VendingMachine"
            def machine = new VendingMachineBase();

        and: "a message is sent to the display"
            def expectedMessage = "Smoke test"
            machine.displayMessage( expectedMessage )

        when: "the the currently displayed message is retrieved"
            def retrievedMessage = machine.getCurrentlyDisplayedMessage()

        then: "the retrieved message should match the sent message"
            expectedMessage == retrievedMessage
     }
}
