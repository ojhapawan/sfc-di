package com.example.sfcdi.controller;

import com.example.sfcdi.services.ConstructorInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
        setterInjectionController=new SetterInjectionController();
        setterInjectionController.setGreetingService(new ConstructorInjectionGreetingService());
    }

    @Test
    void sayGreeting() {
        System.out.println(setterInjectionController.sayGreeting());
    }
}