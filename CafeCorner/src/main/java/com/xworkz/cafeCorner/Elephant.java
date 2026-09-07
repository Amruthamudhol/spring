package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elephant {
    private Glue glue;

    public Elephant() {
        System.out.println("created Elephant");
    }

    @Autowired
    public  void setGlue(Glue glue) {
        System.out.println("setting glue in elephant");
        this.glue = glue;
    }
}
