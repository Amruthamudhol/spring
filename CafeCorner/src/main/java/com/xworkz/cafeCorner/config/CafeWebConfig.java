package com.xworkz.cafeCorner.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.cafeCorner.web")
public class CafeWebConfig {
    public CafeWebConfig() {
        System.out.println("created CafeWebConfig");
    }
}
