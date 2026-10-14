package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDTO;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class WineRepoImpl implements WineRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(WineEntity wineEntity) {
        System.out.println("created save() in WineRepoImpl ");
        System.out.println("WineEntity :" + wineEntity);
        entityManager.merge(wineEntity);
        return  true;

    }

    @Override
    public List<WineEntity> findAll() {
        System.out.println("findAll() called in WineRepoImpl");
        List<WineEntity> wineEntityList = this.entityManager
                .createNamedQuery("findAll", WineEntity.class)
                .getResultList();

        System.out.println("wineEntityList total: " + wineEntityList.size());
        return wineEntityList;
    }

    @Override
    public Optional<WineEntity> findById(Integer id) {
        System.out.println("findById() called in WineRepoImpl() with id: " + id);
       WineEntity wineEntity= this.entityManager.find(WineEntity.class, id);
        return Optional.ofNullable(wineEntity);
    }

    public WineRepoImpl() {
        System.out.println("creted WineRepoImpl()");
    }
}
