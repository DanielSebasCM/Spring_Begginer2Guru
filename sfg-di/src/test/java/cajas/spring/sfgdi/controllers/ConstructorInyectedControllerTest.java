package cajas.spring.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cajas.spring.sfgdi.services.PrimaryGreetingService;

public class ConstructorInyectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PrimaryGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
