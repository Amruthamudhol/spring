package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WineRepoImpl implements WineRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(WineEntity wineEntity) {
        System.out.println("created save() in WineRepoImpl ");
        System.out.println("WineEntity :" + wineEntity);
        entityManager.persist(wineEntity);
        return  true;

    }

    public WineRepoImpl() {
        System.out.println("creted WineRepoImpl()");
    }
}
