package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.GinDTO;
import com.xworkz.opener.entity.GinEntity;
import com.xworkz.opener.repo.GinRepo;
import com.xworkz.opener.service.GinService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class GinServiceImpl implements GinService {

    @Autowired
    private GinRepo ginRepo;

    @Override
    public boolean validateAndSave(GinDTO ginDTO) {

        System.out.println("Running validateAndSave() in GinServiceImpl");

        if (ginDTO != null) {
            System.out.println("Converting DTO into Entity");
            GinEntity ginEntity = new GinEntity();
            BeanUtils.copyProperties(ginDTO, ginEntity);
            this.ginRepo.save(ginEntity);

            return true;
        }

        return false;
    }

    @Override
    public List<GinDTO> findAll() {

        System.out.println("Running findAll() in GinServiceImpl");

        List<GinEntity> ginEntityList = this.ginRepo.findAll();
        List<GinDTO> ginDTOList = new ArrayList<>();

        if (ginEntityList != null ) {

            ginDTOList = ginEntityList.stream()
                    .map(ginEntity -> {
                        GinDTO ginDTO = new GinDTO();
                        BeanUtils.copyProperties(ginEntity, ginDTO);
                        return ginDTO;
                    })
                    .collect(Collectors.toList());
        }

        System.out.println("GinDTOList total: " + ginDTOList.size());

        return ginDTOList;
    }
}