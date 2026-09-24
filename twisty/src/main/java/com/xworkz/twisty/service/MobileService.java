package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.MobileDTO;

public interface MobileService {
    boolean validateAndSave(MobileDTO mobileDTO);
}
