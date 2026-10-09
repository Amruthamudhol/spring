package com.xworkz.opener.repo;

import com.xworkz.opener.entity.GinEntity;

import java.util.List;

public interface GinRepo {
    boolean save(GinEntity ginEntity);
    List<GinEntity> findAll();
}
