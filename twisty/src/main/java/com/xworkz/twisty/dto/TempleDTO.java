package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class TempleDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String templeName;

    @NotNull
    @Size(min = 3, max = 30)
    private String location;

    @NotNull
    @Size(min = 3, max = 30)
    private String city;

    @NotNull
    @Size(min = 3, max = 30)
    private String godName;
}
