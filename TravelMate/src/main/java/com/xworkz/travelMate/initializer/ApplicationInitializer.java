package com.xworkz.travelMate.initializer;

import com.xworkz.travelMate.config.DatabaseConfig;
import com.xworkz.travelMate.config.PrimaryConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DatabaseConfig.class, PrimaryConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
