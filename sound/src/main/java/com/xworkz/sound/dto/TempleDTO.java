package com.xworkz.sound.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class TempleDTO {
    private String templeName;
    private String godName;
    private String location;
    private String city;

    public TempleDTO() {
        System.out.println("created TempleDTO");
    }
}
