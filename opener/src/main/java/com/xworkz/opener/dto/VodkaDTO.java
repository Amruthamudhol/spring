package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class VodkaDTO {

    @NotBlank(message = "Company name is required")
    @Size(min = 3, max = 30, message = "Company name must be between 3 and 30 characters")
    private String companyName;

    @NotBlank(message = "Brand name is required")
    @Size(min = 3, max = 30, message = "Brand name must be between 3 and 30 characters")
    private String brandName;

    @NotBlank(message = "Vodka type is required")
    private String vodkaType;

    @NotNull(message = "Manufacturing date is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manfDate;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "Bottle size is required")
    private String bottleSize;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "Quality is required")
    private String quality;

    @NotNull(message = "Availability is required")
    private Boolean availability;
}