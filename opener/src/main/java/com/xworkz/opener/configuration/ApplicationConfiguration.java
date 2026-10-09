package com.xworkz.opener.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.opener")
@EnableWebMvc
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("created ApplicationConfiguration() ");
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {

        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        // Folder inside your webapp, use "/" if JSP files are directly inside webapp.
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
