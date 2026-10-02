package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.PlaceDTO;
import com.xworkz.twisty.repo.PlaceRepo;
import com.xworkz.twisty.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepo placeRepo;

    @Override
    public boolean validateAndSave(PlaceDTO placeDTO) {
        System.out.println("Running validateAndSave() in PlaceServiceImpl");
        placeRepo.save(placeDTO);
        return true;
    }
}
