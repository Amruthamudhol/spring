package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.TelephoneDTO;

public interface TelephoneService {
    boolean validateAndSave(TelephoneDTO telephoneDTO);
}
