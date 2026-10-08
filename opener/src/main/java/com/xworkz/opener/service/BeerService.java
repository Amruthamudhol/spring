package com.xworkz.opener.service;

import com.xworkz.opener.dto.BeerDTO;


public interface BeerService {
    boolean validateAndSave(BeerDTO beerDTO);
}
