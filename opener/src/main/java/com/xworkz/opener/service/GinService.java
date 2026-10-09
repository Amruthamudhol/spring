package com.xworkz.opener.service;

import com.xworkz.opener.dto.GinDTO;
import com.xworkz.opener.entity.GinEntity;

import java.util.List;

public interface GinService {
    boolean validateAndSave(GinDTO ginDTO);
    List<GinDTO> findAll();
}
