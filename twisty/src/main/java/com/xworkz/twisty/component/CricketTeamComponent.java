package com.xworkz.twisty.component;

import com.xworkz.twisty.dto.CricketTeamDTO;
import com.xworkz.twisty.service.CricketTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CricketTeamComponent {

    @Autowired
    private CricketTeamService cricketTeamService;

    public CricketTeamComponent() {
        System.out.println("CricketTeamComponent Created");
    }

    @RequestMapping("/cricketTeam")
    public String onCricketTeam(CricketTeamDTO cricketTeamDTO, Model model) {
        System.out.println("running cricketTeam()");
        System.out.println("CricketTeamDto-->"+cricketTeamDTO);
        this.cricketTeamService.validateAndSave(cricketTeamDTO);
        model.addAttribute("message", "CricketTeam details saved successfully!");
        return "/CricketTeam.jsp";
    }
}
