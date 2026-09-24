package com.xworkz.twisty.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TelephoneDTO {
    private String name;
    private String mobileNumber;
    private String email;
    private String message;

    public TelephoneDTO() {
        System.out.println("created TelephoneDTO");
    }
}
