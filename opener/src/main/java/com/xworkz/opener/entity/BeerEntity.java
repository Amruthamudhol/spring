package com.xworkz.opener.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Beer")
@ToString
public class BeerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "brandName")
    private String brandName;

    @Column(name = "beerType")
    private String beerType;

    @Column(name = "manfDate")
    private LocalDate manfDate;

    @Column(name = "price")
    private Double price;
}
