package com.xworkz.opener.service;

import com.xworkz.opener.dto.VodkaDTO;

public interface VodkaService {

    boolean validateAndSave(VodkaDTO vodkaDTO);
}