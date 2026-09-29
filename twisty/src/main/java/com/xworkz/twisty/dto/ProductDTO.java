package com.xworkz.twisty.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class ProductDTO {
    @NotNull
@Size(min = 3, max = 30)
private String productName;

    @Min(1)
    private double productPrice;

    @NotNull
    @Size(min = 2, max = 20)
    private String brand;

    public ProductDTO() {
        System.out.println("created ProductDTO");
    }
}
