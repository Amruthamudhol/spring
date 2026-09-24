package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.RegisterDTO;
import com.xworkz.twisty.service.RegisterService;
import org.springframework.stereotype.Component;

@Component
public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean validateAndSave(RegisterDTO registerDTO) {
        System.out.println("running validateAndSave() in RegisterServiceImpl ");
        return true;
    }
}
