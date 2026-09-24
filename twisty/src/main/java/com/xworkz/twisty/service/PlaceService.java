package com.xworkz.twisty.service;


import com.xworkz.twisty.dto.PlaceDTO;

public interface PlaceService {
    boolean validateAndSave(PlaceDTO placeDTO);
}
