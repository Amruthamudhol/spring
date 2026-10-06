package com.xworkz.opener.service;

import com.xworkz.opener.dto.WineDTO;

public interface WineService {
    void validateAndSave(WineDTO wineDTO);
}
