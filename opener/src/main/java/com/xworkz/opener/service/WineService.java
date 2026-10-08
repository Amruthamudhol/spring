package com.xworkz.opener.service;

import com.xworkz.opener.dto.WineDTO;

public interface WineService {
    boolean validateAndSave(WineDTO wineDTO);
}
