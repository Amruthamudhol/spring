package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    public Box() {
        System.out.println("created Box");
    }
    private Paint paint;

    @Autowired
    public  void setPaint(Paint paint) {
        System.out.println("setting paint in box");
        this.paint = paint;
    }
}
