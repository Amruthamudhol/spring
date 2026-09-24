package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.PlaceDTO;
import com.xworkz.twisty.service.PlaceService;
import org.springframework.stereotype.Component;

@Component
public class PlaceServiceImpl implements PlaceService {
    @Override
    public boolean validateAndSave(PlaceDTO placeDTO) {
        System.out.println("Running validateAndSave() in PlaceServiceImpl");
        return true;
    }
}
