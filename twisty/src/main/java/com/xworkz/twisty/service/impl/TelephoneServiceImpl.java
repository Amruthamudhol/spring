package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.TelephoneDTO;
import com.xworkz.twisty.service.TelephoneService;
import org.springframework.stereotype.Component;

@Component
public class TelephoneServiceImpl implements TelephoneService {
    @Override
    public boolean validateAndSave(TelephoneDTO telephoneDTO) {
        System.out.println("Running validateAndSave() in TelephoneServiceImpl");
        return true;
    }
}
