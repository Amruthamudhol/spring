package com.xworkz.opener.repo;

import com.xworkz.opener.entity.GinEntity;

import java.util.List;
import java.util.Optional;

public interface GinRepo {
    boolean save(GinEntity ginEntity);
    List<GinEntity> findAll();
    Optional<GinEntity> findById(int id);
}
