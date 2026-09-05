package com.xworkz.ArtGallery.intializer;


import com.xworkz.ArtGallery.config.ArtGalleryConfig;
import com.xworkz.ArtGallery.config.GalleryWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ApplicationInitializer() {
        System.out.println("created ApplicationInitializer");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ArtGalleryConfig.class, GalleryWebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
}
