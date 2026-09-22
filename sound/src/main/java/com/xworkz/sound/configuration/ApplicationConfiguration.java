package com.xworkz.sound.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.sound")
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("ApplicationConfiguration Created");
    }
}
