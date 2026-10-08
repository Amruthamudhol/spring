package com.xworkz.opener.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "vodka")
public class VodkaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;

    private String brandName;

    private String vodkaType;

    private LocalDate manfDate;

    private Double price;

    private String bottleSize;

    private String country;

    private String quality;

    private Boolean availability;
}