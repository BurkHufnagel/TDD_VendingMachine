package com.dbs

import spock.lang.Specification


class MessageDisplaySpec extends Specification {


    def "When a new instance is created, it should display the default message"() {
        given: "a new instance of MessageDisplay is created"
        def display = new MessageDisplay()

        when: "the current message is retrieved"
        def currentMessage = display.getCurrentMessage()

        then: "it should be the default message"
        currentMessage == MessageDisplay.DEFAULT_MESSAGE
    }


    def "When a new message is sent for display, then it should be the currently displayed message"() {
        given: "a new instance of MessageDisplay is created"
        def display = new MessageDisplay()

        when: "a new message is sent for display"
        def newMessage = "Insert Coin"
        display.setDisplayMessage(newMessage)

        then: "it should be the current message"
        newMessage == display.getCurrentMessage()
    }
}
