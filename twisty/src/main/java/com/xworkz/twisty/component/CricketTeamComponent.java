package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.CricketTeamDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CricketTeamComponent {
    public CricketTeamComponent() {
        System.out.println("CricketTeamComponent Created");
    }

    @RequestMapping("/cricketTeam")
    public String onCricketTeam(CricketTeamDTO cricketTeamDTO, Model model) {
        System.out.println("running cricketTeam()");
        System.out.println("CricketTeamDto-->"+cricketTeamDTO);
        model.addAttribute("message", "CricketTeam details saved successfully!");
        return "/CricketTeam.jsp";
    }
}
