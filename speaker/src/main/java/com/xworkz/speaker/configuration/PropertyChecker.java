package com.xworkz.speaker.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class PropertyChecker {
    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    public PropertyChecker() {
        System.out.println("PropertyChecker Created");
    }

    @PostConstruct
    public void check() {
        System.out.println("Checking Properties");
        System.out.println("user name: " + username);
        System.out.println("password: " + password);
    }
}
