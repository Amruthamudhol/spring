package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class MobileDTO {
    public MobileDTO() {
        System.out.println("created MobileDTO");
    }

    @NotNull
    @Size(min = 3, max = 30)
    private String mobileName;

    @NotNull
    @Size(min = 2, max = 20)
    private String brand;

    @NotNull
    @Min(1)
    private Double price;


    private String[] features;
}
