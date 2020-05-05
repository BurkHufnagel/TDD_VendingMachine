package com.dbs

import spock.lang.Specification


class MessageDisplaySpec extends Specification {


    def "When created, it should not be displaying a message"() {
        given: "a new instance of MessageDisplay"
        def display = new MessageDisplay()

        when: "getting the current message"
        def currentMessage = display.getCurrentMessage()

        then: "it should be blank"
        currentMessage.isEmpty()
    }
}
