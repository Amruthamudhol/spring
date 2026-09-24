package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.MobileDTO;
import com.xworkz.twisty.service.MobileService;
import org.springframework.stereotype.Component;

@Component
public class MobileServiceImpl implements MobileService {
    @Override
    public boolean validateAndSave(MobileDTO mobileDTO) {
        System.out.println("Running validateAndSave() in MobileServiceImpl ");
        return true;
    }
}
