package com.xworkz.opener.repo;

import com.xworkz.opener.dto.VodkaDTO;
import com.xworkz.opener.entity.VodkaEntity;

public interface VodkaRepo {

    boolean save(VodkaEntity vodkaEntity);
}