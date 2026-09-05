package com.xworkz.plantCare.initializer;

import com.xworkz.plantCare.config.DatabaseConfig;
import com.xworkz.plantCare.config.PlantWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

    public ApplicationInitializer() {
        System.out.println("created ApplicationInitializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{PlantWebConfig.class, DatabaseConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
