package com.example.sfcdi.controller;

import com.example.sfcdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController=new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(constructorInjectionController.sayGreeting());
    }
}