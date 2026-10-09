package com.xworkz.opener.repo;


import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.entity.WineEntity;

import java.util.List;

public interface BeerRepo {
      boolean save(BeerEntity beerEntity);
      List<BeerEntity> findAll();
}
