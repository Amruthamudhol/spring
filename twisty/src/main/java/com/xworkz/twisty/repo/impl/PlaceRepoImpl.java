package com.xworkz.twisty.repo.impl;

import com.xworkz.twisty.dto.PlaceDTO;
import com.xworkz.twisty.repo.PlaceRepo;
import org.springframework.stereotype.Component;

@Component
public class PlaceRepoImpl implements PlaceRepo {

    @Override
    public boolean save(PlaceDTO placeDTO) {
        System.out.println("Running save() in PlaceRepoImpl");
        return false;
    }
}
