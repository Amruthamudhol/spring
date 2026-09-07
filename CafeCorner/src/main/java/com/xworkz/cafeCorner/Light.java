package com.xworkz.cafeCorner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Light {
    private Marker marker;
    public Light() {
        System.out.println("created Light");
    }
    @Autowired
    public void setMarker(Marker marker) {
        System.out.println("setting marker in light");
        this.marker = marker;
    }
}
