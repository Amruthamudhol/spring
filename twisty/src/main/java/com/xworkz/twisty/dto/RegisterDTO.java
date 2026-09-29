package com.xworkz.twisty.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class RegisterDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 3, max = 30)
    private String lastName;

    @NotNull
    @Size(min = 10, max = 10)
    private String mobileNumber;

    @NotNull
    @Email
    private String email;



    public RegisterDTO() {
        System.out.println("created RegisterDTO");
    }

}
