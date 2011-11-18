package com.milesburton.ultimate.controller

import spock.lang.Specification

class HelloWorldControllerSpec extends Specification {

    def "When a user visits /test they should be greeted by 'Hello World'"(){
        given:
            HelloWorldController controller = new HelloWorldController()

        when:
            String response = controller.index()

        then:
            response == "Hello World"

    }

}
