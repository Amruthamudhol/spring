package com.xworkz.cafeCorner.config;

import com.xworkz.cafeCorner.Cloud;
import com.xworkz.cafeCorner.Throne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.cafeCorner")
public class CafeConfig {
    public CafeConfig() {
        System.out.println("created CafeConfig");
    }


    @Bean
    public Throne throne() {
        return new Throne();
    }

    @Bean
    public Cloud darkCloud() {
        System.out.println("Registered Dark Cloud");
        Cloud cloud = new Cloud();
        return cloud;
    }

    @Bean
    public Cloud dryCloud() {
        System.out.println("Registered Dry Cloud");
        Cloud cloud = new Cloud();
        return cloud;
    }

    @Bean
    public String name() {
        return "Amruta";
    }

    @Bean
    public String email() {
        return "abc@gmail.com";
    }

    @Bean
    public Long mobileNumber() {
        return 9876543210L;
    }
}
