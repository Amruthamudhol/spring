package com.xworkz.twisty.service.impl;

import com.xworkz.twisty.dto.ProductDTO;
import com.xworkz.twisty.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public boolean validateAndsave(ProductDTO productDTO) {
        System.out.println("Running validateAndsave() in ProductServiceImpl");
        return true;
    }
}
