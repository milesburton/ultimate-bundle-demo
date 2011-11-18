package com.milesburton.ultimate.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class WakeupWorldController {

    @RequestMapping(value = "/wakeup*")
    @ResponseBody
    def wakeup() {
        "Wake Up World"
    }
}
