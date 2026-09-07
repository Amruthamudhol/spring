package com.xworkz.cafeCorner.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.cafeCorner")
public class CafeConfig {
    public CafeConfig() {
        System.out.println("created CafeConfig");
    }
}
