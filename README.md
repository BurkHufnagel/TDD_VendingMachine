# TDD_VendingMachine
Project for teaching Test-Driven Development in a hands-on workshop. Attendees will practice TDD/BDD by developing the business logic for a simple vending machine. The project goals and business requirements are listed below.

##### While working on the code, remember:
* Work from the outside in, sometimes called top-down, and let the specifications you create from the requirements help drive the design of your lower-level specifications until you get low enough to complete some production code.
* Specification should be based on business rules. Changing the implementation should not cause them to fail. 
* Take the opportunity to refactor the production and test code to minimize duplication and keep your code clear and readable.

## Project Goal
The goal of this project is to create the "brains" for a vending machine. The machine has three types of items for sale; Gum (20 cents) , Granola Bar (80 cents), and Candy Bar ($1.00), and it accepts nickels, dimes, quarters, and dollar coins.

## User Interface Description
The user interface consists of:
* a slot for inserting coins
* a "Buy Me" button for each item type
* a small LCD panel for displaying messages
* a "Coin Return" button
* a cup for returned coins
* and a slot for the buyer to remove their purchased item(s)

## Other mechanisms
* a rack for each item type that holds the items for sale, and dispenses one item when instructed to do so
* a coin dispenser that will dispense the requested amount to the cup for returned coins

While not visible to you or the user, the coin slot has a built-in coin verifier that automatically rejects anything except nickels, dimes, quarters, and dollar coins, so you do not need to worry about invalid (foreign or counterfeit) coins.

The VendingMachine.png file shows possible classes and events in the system.

## Must-Have Requirements:
* When the user inserts a coin, it should increase the current balance based on the coin's value.
* When the user presses the "Coin Return" button, it should return the current balance in coins.
* When the user presses a "Buy Me" button and the current balance is less than the price of the item, it should display the message: "Insufficient funds. Please insert more coins."
* When the user presses a "Buy Me" button, and current balance is at least equal to the price of an item, and there is at least one of the item type available, the machine should dispense one of the selected item type.
* When the rack for an item type is not empty, the "Buy Me" button for that type should be lit.
* As long as the rack for an item type is empty, the button for that item should not be lit.
* When the user presses a "Buy Me" button that is not lit, the machine should display the message "Item currently unavailable"

## Want-To-Have Requirements:
* Until the current amount of money available equals the price of an item, that item's "Buy Me" button should not be lit. Once the amount is at least equal to its price, then the item's "Buy Me" button should be lit - as long as the rack for that item is not empty.
* If an item jams in the rack, send a message to notify the company to correct it, and treat the rack as if it were empty.
* When the user inserts a coin, the machine should display the current balance so the user knows how much money is available to buy an item.
* If the user presses a "Buy Me" button and the current balance is less than the price of the item, then display a message indicating how much more money the user needs to insert into the coin slot.
* If the rack for an item is empty, notify the company.

## Start with defining a CoinDispenser to handle inserting and returning coins...