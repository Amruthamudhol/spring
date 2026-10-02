package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.VehicleDTO;
import com.xworkz.twisty.repo.VehicleRepo;
import com.xworkz.twisty.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public VehicleServiceImpl() {
        System.out.println("VehicleServiceImpl() is started");
    }

    @Override
    public boolean validateAndSave(VehicleDTO vehicleDTO) {
        System.out.println("Running validateAndSave() in VehicleServiceImpl");
        vehicleRepo.save(vehicleDTO);
        return true;
    }
}
