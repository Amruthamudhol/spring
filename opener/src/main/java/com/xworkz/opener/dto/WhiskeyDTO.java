package com.xworkz.opener.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


@Data
public class WhiskeyDTO {

    @NotBlank
    private String brandName;

    @NotBlank

    private String whiskeyType;

    @NotNull
    @Positive
    private Double price;

    @NotNull
    @Positive
    private Integer quantity;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufacturingDate;
}