package com.dbs

import spock.lang.Specification


class BuyMeButtonSpec extends Specification{
    def machine
    def button


    def setup() {
        machine = new TestableVendingMachine()
        button = new BuyMeButton(machine)
    }


    def "Upon creation a new BuyMeButton should be disabled"() {
        when: "a new BuyMeButton is created"
        def button = new BuyMeButton(null)

        then: "it should be disabled by default"
        button.isEnabled() == false
    }

    def "When an enabled button is pushed, it should notify the vending machine"() {
        given: "an enabled button"
        button.enable()

        when: "it is pressed"
        button.pressed()

        then: "the vending machine should have been notified"
        machine.wasButtonPressed(button) == true
    }


    def "When an disabled button is pushed, it shouldn't notify the vending machine"() {
        given: "an disabled button"
        button.disable()

        when: "it is pressed"
        button.pressed()

        then: "the vending machine should not have been notified"
        machine.wasButtonPressed(button) == false
    }


    class TestableVendingMachine extends VendingMachine {
        BuyMeButton pressedButton = null


        @Override
        public void buyMeButtonPressed(BuyMeButton buyMeButton) {
            pressedButton = buyMeButton
        }


        boolean wasButtonPressed(BuyMeButton button) {
            return pressedButton == button;
        }
    }
}