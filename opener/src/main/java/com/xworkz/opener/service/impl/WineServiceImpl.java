package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.repo.WineRepo;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepo wineRepo;

    @Override
    public void validateAndSave(WineDTO wineDTO) {
        System.out.println("running validateAndSave()");
       this. wineRepo.save(wineDTO);

    }
}
