package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.TempleDTO;
import com.xworkz.twisty.service.TempleService;
import org.springframework.stereotype.Component;

@Component
public class TempleServiceImpl implements TempleService {
    @Override
    public boolean validateAndSave(TempleDTO templeDTO) {
        System.out.println("running validateAndSave() in TempleServiceImpl");


        return false;
    }
}
