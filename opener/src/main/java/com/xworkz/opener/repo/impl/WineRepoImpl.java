package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

@Repository
public class WineRepoImpl implements WineRepo {
    @Override
    public void save(WineDTO wineDTO) {
        System.out.println("created save() in WineRepoImpl ");
    }

    public WineRepoImpl() {
        System.out.println("creted WineRepoImpl()");
    }
}
