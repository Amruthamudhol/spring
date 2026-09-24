package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.CricketTeamDTO;
import com.xworkz.twisty.service.CricketTeamService;
import org.springframework.stereotype.Component;

@Component
public class CricketTeamServiceImpl implements CricketTeamService {


    @Override
    public boolean validateAndSave(CricketTeamDTO cricketTeamDTO) {
        System.out.println("running validateAndSave()");
        return true;
    }
}
