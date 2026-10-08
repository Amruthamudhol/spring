package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.entity.VodkaEntity;
import com.xworkz.opener.repo.VodkaRepo;
import com.xworkz.opener.service.VodkaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class VodkaServiceImpl implements VodkaService {

    @Autowired
    private VodkaRepo vodkaRepo;

    public VodkaServiceImpl() {
        System.out.println("VodkaServiceImpl created");
    }

    @Override
    @Transactional
    public boolean validateAndSave(VodkaDTO vodkaDTO) {

        System.out.println("Running validateAndSave()");
        System.out.println("VodkaDTO --> " + vodkaDTO);

        VodkaEntity vodkaEntity = new VodkaEntity();
        BeanUtils.copyProperties(vodkaDTO, vodkaEntity);

        return vodkaRepo.save(vodkaEntity);

    }
}