package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
    private Perfume perfume;
    private Paint paint;
    private Glue glue;

    public Bottle() {
        System.out.println("created Bottle");
    }

    @Autowired
    public  Bottle(Perfume perfume, Paint paint,Glue glue) {
        System.out.println("setting perfume, paint and glue in bottle");
        this.perfume = perfume;
        this.paint = paint;
        this.glue = glue;
    }

}
