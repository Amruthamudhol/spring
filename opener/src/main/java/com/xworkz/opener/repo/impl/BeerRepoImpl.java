package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.BeerRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class BeerRepoImpl implements BeerRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(BeerEntity beerEntity) {

        System.out.println("created save() in BeerRepoImpl");
        System.out.println("BeerEntity : " + beerEntity);
        entityManager.merge(beerEntity);

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

    @Override
    public Optional<BeerEntity> findById(int id) {
        System.out.println("findById() called in BeerRepoImpl");
        BeerEntity beerEntity = this.entityManager.find(BeerEntity.class, id);
        return Optional.ofNullable(beerEntity);
    }


    @Override
    public void remove(int id) {

        BeerEntity beerEntity = entityManager.find(BeerEntity.class, id);

        if (beerEntity != null) {
            entityManager.remove(beerEntity);
            System.out.println("Beer removed successfully");
        } else {
            System.out.println("Beer not found");
        }
    }

    public BeerRepoImpl() {
        System.out.println("created BeerRepoImpl()");
    }
}
