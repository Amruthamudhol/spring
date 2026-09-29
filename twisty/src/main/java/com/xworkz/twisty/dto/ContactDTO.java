package com.xworkz.twisty.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class ContactDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @NotNull
    @Size(min = 10, max = 10)
    private String mobileNumber;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 5, max = 200)
    private String message;

    public ContactDTO() {
        System.out.println("created ContactDTO");
    }
}
