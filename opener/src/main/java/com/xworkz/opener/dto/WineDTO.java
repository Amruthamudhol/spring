package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Data
public class WineDTO {

        @NotBlank
        @Size(min = 3, max = 50,message = "Company name should be between 3 and 50 characters")
        private String companyName;

        @NotBlank
        @Size(min = 3, max = 50,message = "Manufacturer name should be between 3 and 50 characters")
        private String manfName;

        @NotNull
        @Past
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate manfDate;

        @NotNull
        @DecimalMin(value = "0.1")
        @DecimalMax(value = "2500")

        private Double age;
}