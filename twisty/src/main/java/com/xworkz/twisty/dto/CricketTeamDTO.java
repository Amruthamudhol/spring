package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@ToString
@Setter
public class CricketTeamDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String playerName;

    @NotNull
    @Min(18)
    @Max(60)
    private Integer age;

    @NotNull
    @Size(min = 3, max = 20)
    private String role;

    public CricketTeamDTO() {
        System.out.println("created CricketTeamDTO");
    }
}
