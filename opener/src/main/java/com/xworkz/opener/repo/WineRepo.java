package com.xworkz.opener.repo;


import com.xworkz.opener.entity.WineEntity;

import java.util.List;
import java.util.Optional;

public interface WineRepo {
    public boolean save(WineEntity wineEntity);
    List<WineEntity> findAll();
    Optional<WineEntity> findById(Integer id);
    void deleteById(Integer id);
}
