package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.GinEntity;
import com.xworkz.opener.repo.GinRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class GinRepoImpl implements GinRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(GinEntity ginEntity) {
        System.out.println("Running save() in GinRepoImpl ");
        System.out.println("GinEntity:"+ginEntity);
        entityManager.merge(ginEntity);
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

    @Override
    public Optional<GinEntity> findById(int id) {
        System.out.println("Running findById() in GinRepoImpl");
        GinEntity ginEntity=this.entityManager.find(GinEntity.class, id);
        return Optional.ofNullable(ginEntity);
    }
}
