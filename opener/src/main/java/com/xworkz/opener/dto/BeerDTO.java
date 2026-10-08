package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class BeerDTO {

    private int id;

    @NotBlank
    @Size(min = 3, max = 30)
    private String companyName;

    @NotBlank
    @Size(min = 3, max = 30)
    private String brandName;

    @NotBlank
    @Size(min = 3, max = 20)
    private String beerType;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manfDate;

    @NotNull
    @Positive
    private Double price;
}