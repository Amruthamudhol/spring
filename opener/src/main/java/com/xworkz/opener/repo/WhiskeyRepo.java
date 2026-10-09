package com.xworkz.opener.repo;

import com.xworkz.opener.entity.WhiskeyEntity;

import java.util.List;

public interface WhiskeyRepo {

    boolean save(WhiskeyEntity whiskeyEntity);
    List<WhiskeyEntity> findAll();
}