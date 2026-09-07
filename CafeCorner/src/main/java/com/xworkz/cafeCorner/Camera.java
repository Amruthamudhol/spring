package com.xworkz.cafeCorner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
    private Light light;
    public Camera() {
        System.out.println("created Camera");
    }

    @Autowired
    public  void setLight(Light light) {
        System.out.println("setting light in camera");
        this.light = light;
    }
}
