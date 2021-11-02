package com.example.sfcdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
