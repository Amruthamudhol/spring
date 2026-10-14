package com.xworkz.opener.repo.impl;

import com.xworkz.opener.entity.WhiskeyEntity;
import com.xworkz.opener.repo.WhiskeyRepo;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

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
        entityManager.merge(whiskeyEntity);

        return true;
    }

    @Override
    public List<WhiskeyEntity> findAll() {
        System.out.println("findAll() called in WhiskeyRepoImpl()");
        List<WhiskeyEntity> whiskeyEntities = entityManager
                .createNamedQuery("FindAllWhiskey", WhiskeyEntity.class)
                .getResultList();
        return whiskeyEntities;
    }

    @Override
    public Optional<WhiskeyEntity> findById(Integer id) {
        System.out.println("findById() called in WhiskeyRepoImpl() with id: " + id);
        WhiskeyEntity whiskeyEntity = this.entityManager.find(WhiskeyEntity.class, id);
        return Optional.ofNullable(whiskeyEntity);
    }
}