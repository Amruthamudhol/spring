package com.xworkz.opener.service;

import com.xworkz.opener.dto.GinDTO;

public interface GinService {
    boolean validateAndSave(GinDTO ginDTO);
}
