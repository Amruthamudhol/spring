package com.xworkz.opener.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Wine")
public class WineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "manfName")
    private String manfName;

    @Column(name = "manfDate")
    private LocalDate manfDate;

    @Column(name = "age")
    private Double age;
}
