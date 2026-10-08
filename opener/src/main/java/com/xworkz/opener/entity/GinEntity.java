package com.xworkz.opener.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "gin")
public class GinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "brandName")
    private String brandName;

    @Column(name = "ginType")
    private String ginType;

    @Column(name = "manfDate")
    private LocalDate manfDate;

    @Column(name = "price")
    private Double price;

    @Column(name = "bottleSize")
    private String bottleSize;

    @Column(name = "country")
    private String country;

    @Column(name = "quality")
    private String quality;

    @Column(name = "availability")
    private Boolean availability;
}
