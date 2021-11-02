package com.example.sfcdi.controller;

import com.example.sfcdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
