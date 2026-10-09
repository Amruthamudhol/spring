package com.xworkz.opener.repo;


import com.xworkz.opener.entity.WineEntity;

import java.util.List;

public interface WineRepo {
    public boolean save(WineEntity wineEntity);
    List<WineEntity> findAll();
}
