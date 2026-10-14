package com.xworkz.opener.repo;

import com.xworkz.opener.entity.WhiskeyEntity;

import java.util.List;
import java.util.Optional;

public interface WhiskeyRepo {

    boolean save(WhiskeyEntity whiskeyEntity);
    List<WhiskeyEntity> findAll();
    Optional<WhiskeyEntity> findById(Integer id);
    void remove(Integer id);
}