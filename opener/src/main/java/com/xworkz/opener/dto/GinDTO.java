package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class GinDTO {
    private int id;

    @NotBlank
    @Size(min = 3, max = 30)
    private String companyName;

    @NotBlank
    @Size(min = 3, max = 30)
    private String brandName;

    @NotBlank
    @Size(min = 3, max = 20)
    private String ginType;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manfDate;

    @NotNull
    @Positive
    private Double price;

    @NotBlank
    private String bottleSize;

    @NotBlank
    private String country;

    @NotBlank
    private String quality;

    @NotNull
    private Boolean availability;
}
