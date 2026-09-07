package com.xworkz.cafeCorner.webinit;

import com.xworkz.cafeCorner.config.CafeConfig;
import com.xworkz.cafeCorner.config.CafeWebConfig;
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
        return new Class[]{CafeConfig.class, CafeWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
