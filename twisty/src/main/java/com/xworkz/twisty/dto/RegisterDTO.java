package com.xworkz.twisty.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class RegisterDTO {
    private String name;
    private String mobileNumber;
    private String email;
    private String message;

    public RegisterDTO() {
        System.out.println("created RegisterDTO");
    }

}
