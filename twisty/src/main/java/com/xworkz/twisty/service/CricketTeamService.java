package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.CricketTeamDTO;

public interface CricketTeamService {
    boolean validateAndSave(CricketTeamDTO cricketTeamDTO);
}
