package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.MobileDTO;
import com.xworkz.twisty.dto.MovieDTO;

public interface MovieService {
    boolean validateAndSave(MovieDTO movieDTO);
}
