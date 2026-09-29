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
public class TelephoneDTO {

    @NotNull
    @Size(min = 3, max = 30)
    private String operatorName;

    @NotNull
    @Size(min = 2, max = 30)
    private String companyName;

    @NotNull
    @Size(min = 10, max = 10)
    private String mobileNumber;

    @NotNull
    @Size(min = 3, max = 30)
    private String location;
    public TelephoneDTO() {
        System.out.println("created TelephoneDTO");
    }
}
