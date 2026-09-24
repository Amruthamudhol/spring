package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.CameraDTO;
import com.xworkz.twisty.service.CamearaSevice;
import org.springframework.stereotype.Component;

@Component
public class CameraServiceImpl implements CamearaSevice {
    public CameraServiceImpl() {
        System.out.println("created CameraServiceImpl");
    }

    @Override
    public boolean validateAndSave(CameraDTO cameraDTO) {
        System.out.println("running validateAndSave()");
        return true;
    }
}
