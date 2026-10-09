package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import com.xworkz.opener.service.WineService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepo wineRepo;

    @Override
    public boolean validateAndSave(WineDTO wineDTO) {

        System.out.println("running validateAndSave()");

        if (wineDTO != null) {

            System.out.println("Converting dto into entity");
            WineEntity wineEntity = new WineEntity();
            BeanUtils.copyProperties(wineDTO, wineEntity);
            this.wineRepo.save(wineEntity);

            return true;
        }

        return false;
    }

    @Override
    public List<WineDTO> findAll() {

        System.out.println("The findAll() method is called in service");

        List<WineEntity> wineEntityList = this.wineRepo.findAll();
        List<WineDTO> wineDTOList = new ArrayList<>();

        if (wineEntityList != null) {
            System.out.println("Converting entities to DTOs");

            wineDTOList = wineEntityList.stream()
                    .map(entity -> {
                        WineDTO wineDTO = new WineDTO();
                        BeanUtils.copyProperties(entity, wineDTO);
                        return wineDTO;
                    })
                    .collect(Collectors.toList());
        }

        System.out.println("Total wine DTOs: " + wineDTOList.size());

        return wineDTOList;
    }
}