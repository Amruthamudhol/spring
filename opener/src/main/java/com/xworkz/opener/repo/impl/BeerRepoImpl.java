package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.repo.BeerRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    public BeerRepoImpl() {
        System.out.println("created BeerRepoImpl()");
    }
}
