package com.example.sfcdi.controller;

import com.example.sfcdi.services.ConstructorInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController=new PropertyInjectionController();
        propertyInjectionController.greetingService=new ConstructorInjectionGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(propertyInjectionController.sayGreeting());
    }
}