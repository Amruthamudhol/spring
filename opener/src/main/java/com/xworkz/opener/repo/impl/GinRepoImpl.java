package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.GinEntity;
import com.xworkz.opener.repo.GinRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
