package com.example.sfcdi.controller;

import com.example.sfcdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController=new PropertyInjectionController();
        propertyInjectionController.greetingService=new GreetingServiceImpl();
    }

    @Test
    void sayGreeting() {
        System.out.println(propertyInjectionController.sayGreeting());
    }
}