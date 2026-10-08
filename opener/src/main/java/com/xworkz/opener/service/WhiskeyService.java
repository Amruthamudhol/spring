package com.xworkz.opener.service;

import com.xworkz.opener.dto.WhiskeyDTO;

public interface WhiskeyService {

    boolean validateAndSave(WhiskeyDTO whiskeyDTO);
}