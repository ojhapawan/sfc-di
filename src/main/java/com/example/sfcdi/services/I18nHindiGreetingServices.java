package com.example.sfcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HN")
@Service("i18nService")
public class I18nHindiGreetingServices implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Namaste Bharat ----- HN";
    }
}
