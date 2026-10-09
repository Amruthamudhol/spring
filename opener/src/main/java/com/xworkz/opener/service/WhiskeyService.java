package com.xworkz.opener.service;

import com.xworkz.opener.dto.WhiskeyDTO;

import java.util.List;

public interface WhiskeyService {

    boolean validateAndSave(WhiskeyDTO whiskeyDTO);

    List<WhiskeyDTO> findAll();
}