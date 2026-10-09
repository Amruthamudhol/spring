package com.xworkz.opener.service;

import com.xworkz.opener.dto.BeerDTO;

import java.util.List;


public interface BeerService {
    boolean validateAndSave(BeerDTO beerDTO);
    List<BeerDTO> findAll();
}
