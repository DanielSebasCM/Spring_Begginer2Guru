package cajas.spring.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cajas.spring.sfgdi.services.PrimaryGreetingService;

public class SetterInyectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PrimaryGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
