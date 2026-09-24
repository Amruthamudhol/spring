package com.xworkz.twisty.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ApplicationInit() {
        System.out.println("ApplicationInit Created");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/camera","/contact","/product","/telephoneOperator","/movie","/temple","/register","/cricketTeam","/mobile","/place"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ApplicationConfiguration.class};
    }
}
