package com.xworkz.booknest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class xworkzwebinit extends AbstractAnnotationConfigDispatcherServletInitializer {


    public xworkzwebinit() {
        System.out.println("created xworkzwebinit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
