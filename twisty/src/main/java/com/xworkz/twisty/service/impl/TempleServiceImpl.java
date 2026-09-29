package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.TempleDTO;
import com.xworkz.twisty.service.TempleService;
import org.springframework.stereotype.Component;

@Component
public class TempleServiceImpl implements TempleService {
    @Override
    public void validateAndSave(TempleDTO templeDTO) {
        System.out.println("running validateAndSave() in TempleServiceImpl");
        System.out.println("TempleDto-->"+templeDTO);

    }
}
