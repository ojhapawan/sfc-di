package com.example.sfcdi.controller;

import com.example.sfcdi.services.ConstructorInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController=new ConstructorInjectionController(new ConstructorInjectionGreetingService());
    }

    @Test
    void sayGreeting() {
        System.out.println(constructorInjectionController.sayGreeting());
    }
}