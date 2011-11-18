package com.milesburton.ultimate.controller

import spock.lang.Specification

class WakeUpWorldControllerSpec extends Specification {

    def "When a user visits /wakeup they should be greeted by 'Wake Up World'"(){
        given:
            WakeupWorldController controller = new WakeupWorldController()

        when:
            String response = controller.wakeup()

        then:
            response == "Wake Up World"

    }

}
