package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.BeerRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class BeerRepoImpl implements BeerRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(BeerEntity beerEntity) {

        System.out.println("created save() in BeerRepoImpl");
        System.out.println("BeerEntity : " + beerEntity);

        entityManager.persist(beerEntity);

        return true;
    }

    @Override
    public List<BeerEntity> findAll() {
        System.out.println("findAll() called in BeerRepoImpl");
        List<BeerEntity> beerEntityList = this.entityManager
                .createNamedQuery("selectAll", BeerEntity.class)
                .getResultList();

        System.out.println("wineEntityList total: " + beerEntityList.size());
        return beerEntityList;
    }

    public BeerRepoImpl() {
        System.out.println("created BeerRepoImpl()");
    }
}
