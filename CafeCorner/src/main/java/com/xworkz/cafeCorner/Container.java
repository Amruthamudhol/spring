package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {
    public Container() {
        System.out.println("created Container");
    }
    private Glass glass;

    @Autowired
    public  void setGlass(Glass glass) {
        System.out.println("setting glass in container");
        this.glass = glass;
    }
}
