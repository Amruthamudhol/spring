package com.xworkz.twisty.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.twisty")
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("ApplicationConfiguration Created");
    }
}
