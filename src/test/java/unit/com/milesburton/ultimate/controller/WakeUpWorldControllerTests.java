package com.milesburton.ultimate.controller;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WakeUpWorldControllerTests {

    @Test
    public void testTestControllerSaysHelloWorld() {
        HelloWorldController testController = new HelloWorldController();
        String response = testController.index();
        assertEquals("HelloWorldController didn't say hello to the world", "Hello World", response);
    }

}
