package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class MovieDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String movieName;

    @NotNull
    @Size(min = 3, max = 30)
    private String heroName;

    @NotNull
    private String director;

    @NotNull
    private String language;

    public MovieDTO() {
        System.out.println("created MovieDTO");
    }
}
