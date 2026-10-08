package com.xworkz.opener.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "whiskey")
public class WhiskeyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "whiskey_type")
    private String whiskeyType;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "manufacturing_date")
    private LocalDate manufacturingDate;
}