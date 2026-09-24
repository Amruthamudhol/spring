package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.CameraDTO;
import com.xworkz.twisty.dto.ContactDTO;
import com.xworkz.twisty.service.ContactService;
import org.springframework.stereotype.Component;

@Component
public class ContactServiceImpl implements ContactService {
    public ContactServiceImpl() {
        System.out.println("created ContactServiceImpl");
    }

    @Override
    public boolean validateAndSave(ContactDTO contactDTO) {
        System.out.println("running validateAndSave()");
        return true;
    }
}
