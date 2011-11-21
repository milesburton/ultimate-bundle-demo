package com.milesburton.ultimate.geb.spec

import geb.spock.GebSpec
import com.milesburton.ultimate.geb.pages.WakeUpWorldPage

class WakeUpWorldControllerSpec extends GebSpec{
    def "check Wake Up world page returns wake up world"() {
        when:
        to WakeUpWorldPage

        then:
        at WakeUpWorldPage

    }
}
