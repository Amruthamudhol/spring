package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.MobileDTO;
import com.xworkz.twisty.dto.MovieDTO;
import com.xworkz.twisty.service.MovieService;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceImpl implements MovieService {
    @Override
    public boolean validateAndSave(MovieDTO movieDTO) {
        System.out.println("running validateAndSave() in MovieServiceImpl");
        return true;
    }
}
