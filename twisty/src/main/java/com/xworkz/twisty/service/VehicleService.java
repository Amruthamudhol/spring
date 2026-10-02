package com.xworkz.twisty.service;


import com.xworkz.twisty.dto.VehicleDTO;

public interface VehicleService {
    public boolean validateAndSave(VehicleDTO vehicleDTO);
}
