package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CameraDTO {
    private String cameraName;
    private String brand;
    private String model;
    private String price;

    public CameraDTO() {
        System.out.println("created CameraDTO");
    }
}
