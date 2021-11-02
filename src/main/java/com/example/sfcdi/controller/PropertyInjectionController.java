package com.example.sfcdi.controller;

import com.example.sfcdi.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
