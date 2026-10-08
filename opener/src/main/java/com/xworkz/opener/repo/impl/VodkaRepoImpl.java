package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.entity.VodkaEntity;
import com.xworkz.opener.repo.VodkaRepo;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class VodkaRepoImpl implements VodkaRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public VodkaRepoImpl() {
        System.out.println("VodkaRepoImpl created");
    }

    @Override
    public boolean save(VodkaEntity vodkaEntity) {

        System.out.println("Executing save() in VodkaRepoImpl");
        System.out.println("VokaEntity:"+vodkaEntity);
        entityManager.persist(vodkaEntity);


        return true;
    }
}