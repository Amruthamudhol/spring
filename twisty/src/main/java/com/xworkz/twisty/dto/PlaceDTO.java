package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class PlaceDTO {
    @NotNull
    @Size(min = 3, max = 30,message = "Place name should be between 3 to 30 characters")
    private String placeName;

    @NotNull
    @Size(min = 3, max = 30,message = "City name should be between 3 to 30 characters")
    private String city;

    @NotNull
    @Size(min = 3, max = 30,message = "State name should select")
    private String state;



}
