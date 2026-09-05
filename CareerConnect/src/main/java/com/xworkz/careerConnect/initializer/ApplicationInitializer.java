package com.xworkz.careerConnect.initializer;

import com.xworkz.careerConnect.config.CareerConfig;
import com.xworkz.careerConnect.config.CareerWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ApplicationInitializer() {
        System.out.println("created ApplicationInitializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CareerConfig.class,CareerWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
