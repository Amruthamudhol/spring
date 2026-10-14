package com.xworkz.opener.repo;


import com.xworkz.opener.entity.BeerEntity;
import com.xworkz.opener.entity.WineEntity;

import java.util.List;
import java.util.Optional;

public interface BeerRepo {
      boolean save(BeerEntity beerEntity);
      List<BeerEntity> findAll();
      Optional<BeerEntity> findById(int id);

      void remove(int id);
}
