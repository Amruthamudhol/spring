package com.xworkz.smartLaundry.intializer;

import com.xworkz.smartLaundry.config.LaundryConfig;
import com.xworkz.smartLaundry.config.LaundryWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public ApplicationInitializer() {
        System.out.println("createdApplicationInitializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{LaundryWebConfig.class, LaundryConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
