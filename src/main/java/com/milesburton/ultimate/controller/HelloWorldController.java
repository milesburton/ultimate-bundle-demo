package com.milesburton.ultimate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldController {

    @RequestMapping(value = "/test*")
    @ResponseBody
    public String index() {
        return "Hello World";
    }


}