package com.xworkz.twisty.repo.impl;

import com.xworkz.twisty.dto.VehicleDTO;
import com.xworkz.twisty.repo.VehicleRepo;
import org.springframework.stereotype.Component;

@Component
public class VehicleRepoImpl implements VehicleRepo {

    @Override
    public void save(VehicleDTO vehicleDTO) {
        System.out.println("Executing save() in VehicleRepoImpl ");

    }
}
