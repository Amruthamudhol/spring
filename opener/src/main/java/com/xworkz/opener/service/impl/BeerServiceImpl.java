package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.BeerRepo;
import com.xworkz.opener.service.BeerService;
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
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepo beerRepo;

    @Override
    public boolean validateAndSave(BeerDTO beerDTO) {
        System.out.println("running validateAndSave()");

        if (beerDTO != null) {
            System.out.println("Converting dto into entity");
            BeerEntity beerEntity = new BeerEntity();
            BeanUtils.copyProperties(beerDTO, beerEntity);
            this.beerRepo.save(beerEntity);

            return true;
        }

        return false;
    }

    @Override
    public List<BeerDTO> findAll() {
        System.out.println("The findAll() method is called in service");

        List<BeerEntity> beerEntityList = this.beerRepo.findAll();
        List<BeerDTO> beerDTOList = new ArrayList<>();

        if (beerEntityList != null) {
            System.out.println("Converting entities to DTOs");

            beerDTOList= beerEntityList.stream()
                    .map(entity -> {
                        BeerDTO beerDTO = new BeerDTO();
                        BeanUtils.copyProperties(entity, beerDTO);
                        return beerDTO;
                    })
                    .collect(Collectors.toList());
        }

        System.out.println("Total wine DTOs: " + beerDTOList.size());

        return beerDTOList;

    }
}