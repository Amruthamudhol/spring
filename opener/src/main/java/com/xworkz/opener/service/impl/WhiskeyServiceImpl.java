package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WhiskeyDTO;
import com.xworkz.opener.entity.WhiskeyEntity;
import com.xworkz.opener.repo.WhiskeyRepo;
import com.xworkz.opener.service.WhiskeyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WhiskeyServiceImpl implements WhiskeyService {

    @Autowired
    private WhiskeyRepo whiskeyRepo;

    public WhiskeyServiceImpl() {
        System.out.println("WhiskeyServiceImpl() is started");
    }

    @Override
    public boolean validateAndSave(WhiskeyDTO whiskeyDTO) {

        System.out.println("Executing validateAndSave() in WhiskeyServiceImpl");

        WhiskeyEntity whiskeyEntity = new WhiskeyEntity();

        BeanUtils.copyProperties(whiskeyDTO, whiskeyEntity);

        return whiskeyRepo.save(whiskeyEntity);
    }

    @Override
    public List<WhiskeyDTO> findAll() {

        System.out.println("The findAll() method is called in service");

        List<WhiskeyEntity> whiskeyEntityList = this.whiskeyRepo.findAll();

        List<WhiskeyDTO> whiskeyDTOList = whiskeyEntityList.stream()
                .map(entity -> {
                    WhiskeyDTO whiskeyDTO = new WhiskeyDTO();
                    BeanUtils.copyProperties(entity, whiskeyDTO);
                    return whiskeyDTO;
                })
                .collect(Collectors.toList());

        System.out.println("Whiskey DTO list created successfully");
        System.out.println("Total whiskey DTOs: " + whiskeyDTOList.size());
        return whiskeyDTOList;
    }
}