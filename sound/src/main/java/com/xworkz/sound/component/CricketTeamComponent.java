package com.xworkz.sound.component;

import com.xworkz.sound.dto.CricketTeamDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CricketTeamComponent {
    public CricketTeamComponent() {
        System.out.println("CricketTeamComponent Created");
    }

    @RequestMapping("/cricketTeam")
    public String onCricketTeam(CricketTeamDTO cricketTeamDTO) {
        System.out.println("running cricketTeam()");
        System.out.println("CricketTeamDto-->"+cricketTeamDTO);
        return "/CricketTeam.jsp";
    }
}
