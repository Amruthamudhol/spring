package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shield {
    private Paint paint;
    public Shield() {
        System.out.println("created Shield");
    }

    @Autowired
    public  void setPaint(Paint paint) {
        System.out.println("setting paint in shield");
        this.paint = paint;
    }

}
