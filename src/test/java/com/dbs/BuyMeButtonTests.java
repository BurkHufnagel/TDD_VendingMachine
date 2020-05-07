package com.dbs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class BuyMeButtonTests {

    // This is a simple unit test, using the @DisplayName annotation to give it a better description
    @Test
    @DisplayName("Upon creation a new BuyMeButton should be disabled")
    void newButtonShouldBeDisabled() {
        BuyMeButton button = new BuyMeButton(null);

        assertFalse(button.isEnabled());
    }


    // This is a set of nested tests, taking advantage of common settings.
    @Nested
    @DisplayName("Given a BuyMeButton instance")
    class EnableAndDisabledButtonTests {
        TestableVendingMachine machine = new TestableVendingMachine(null);
        BuyMeButton button = new BuyMeButton(machine);

        @Test
        @DisplayName("When an enabled button is pressed, it should notify the vending machine")
        void testingEnabledBehavior() {
            button.enable();
            assertTrue(button.isEnabled());
            machine.clearPressedButton();

            button.pressed();
            assertTrue(machine.wasButtonPressed(button));
        }

        @Test
        @DisplayName("When a disabled button is pressed, it shouldn't notify the vending machine")
        void pushingTheButtonWhenItsDisabledDoesNothing() {
            button.disable();
            assertFalse(button.isEnabled());
            machine.clearPressedButton();

            button.pressed();

            assertFalse(machine.wasButtonPressed(button));
        }
    }


    class TestableVendingMachine extends VendingMachine {
        BuyMeButton pressedButton = null;

        TestableVendingMachine(MessageDisplay display) {
            super(display);
        }

        @Override
        public void buyMeButtonPressed(BuyMeButton buyMeButton) {
            pressedButton = buyMeButton;
        }

        boolean wasButtonPressed(BuyMeButton button) {
            return pressedButton == button;
        }

        void clearPressedButton() {
            pressedButton = null;
        }
    }
}

