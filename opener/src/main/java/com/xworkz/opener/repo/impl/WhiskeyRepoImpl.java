package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.WhiskeyEntity;
import com.xworkz.opener.repo.WhiskeyRepo;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class WhiskeyRepoImpl implements WhiskeyRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public WhiskeyRepoImpl() {
        System.out.println("WhiskeyRepoImpl() is started");
    }

    @Override
    public boolean save(WhiskeyEntity whiskeyEntity) {

        System.out.println("Executing save() in WhiskeyRepoImpl");
        System.out.println("WhiskeyEntity:"+whiskeyEntity);
        entityManager.persist(whiskeyEntity);

        return true;
    }
}