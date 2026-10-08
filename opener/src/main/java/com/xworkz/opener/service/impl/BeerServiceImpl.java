package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.BeerDTO;
import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.repo.BeerRepo;
import com.xworkz.opener.service.BeerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}