package com.dbs

import spock.lang.Specification


class VendingMachineSpec extends Specification {

    // A Spock version of the JUnit test in VendingMachineTest.java
    def "The message sent to the display should be the same as the message sent to the vending machine"() {
        given: "an instance of VendingMachine"
        def mockDisplay = Mock( MessageDisplay )
        def machine = new VendingMachine( mockDisplay )

        and: "a message that should be sent to the display"
        def expectedMessage = "Smoke test"

        when: "the vending machine is told to send a message to the display"
            machine.displayMessage( expectedMessage )

        then: "the message sent to the display should be the same as the message sent to the vending machine"
            1 * mockDisplay.setDisplayMessage( expectedMessage )
     }
}
