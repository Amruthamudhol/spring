package com.xworkz.opener.service;

import com.xworkz.opener.dto.WhiskeyDTO;

import java.util.List;

public interface WhiskeyService {

    boolean validateAndSave(WhiskeyDTO whiskeyDTO);

    List<WhiskeyDTO> findAll();

    WhiskeyDTO findById(Integer id);
    void remove(Integer id);
}