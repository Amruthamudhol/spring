package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ProductDTO {
    private String productName;
    private double productPrice;
    private String brand;

    public ProductDTO() {
        System.out.println("created ProductDTO");
    }
}
