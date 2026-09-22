package com.xworkz.sound.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieDTO {
    private String movieName;
    private String heroName;
    private String director;
    private String language;

    public MovieDTO() {
        System.out.println("created MovieDTO");
    }
}
