package com.xworkz.sound.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContactDTO {
    private String name;
    private String mobileNumber;
    private String email;
    private String message;

    public ContactDTO() {
        System.out.println("created ContactDTO");
    }
}
