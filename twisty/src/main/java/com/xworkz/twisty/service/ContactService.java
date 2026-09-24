package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.CameraDTO;
import com.xworkz.twisty.dto.ContactDTO;

public interface ContactService {
    boolean validateAndSave(ContactDTO contactDTO);
}
