package com.example.sfcdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World ---- from Primary Bean";
    }
}
