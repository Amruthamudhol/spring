package com.xworkz.sound.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class CricketTeamDTO {
    private String playerName;
    private String age;
    private String role;

    public CricketTeamDTO() {
        System.out.println("created CricketTeamDTO");
    }
}
