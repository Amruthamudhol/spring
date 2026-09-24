package com.xworkz.twisty.service;

import com.xworkz.twisty.dto.RegisterDTO;

public interface RegisterService {
    boolean validateAndSave(RegisterDTO registerDTO);
}
