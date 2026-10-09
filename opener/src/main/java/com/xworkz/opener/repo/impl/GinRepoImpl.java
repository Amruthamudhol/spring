package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.GinEntity;
import com.xworkz.opener.repo.GinRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class GinRepoImpl implements GinRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(GinEntity ginEntity) {
        System.out.println("Running save() in GinRepoImpl ");
        System.out.println("GinEntity:"+ginEntity);
        entityManager.persist(ginEntity);
        return false;
    }

    @Override
    public List<GinEntity> findAll() {
        System.out.println("Running findAll() in GinRepoImpl");
        List<GinEntity> ginEntityList = this.entityManager
                .createNamedQuery("readAll", GinEntity.class)
                .getResultList();
        return ginEntityList;
    }
}
