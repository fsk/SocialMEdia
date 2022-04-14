package com.fsk.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {

    @Size(min = 2) @NotNull
    private String name;

    @Size(min = 2) @NotNull
    private String surname;

    @Email(message = "Email is wrong", regexp = "/^\\S+@\\S+\\.\\S+$/") @NotNull
    private String email;

    @Size(min = 5) @NotNull
    private String password;
    private int day;
    private int month;
    private int year;
    private String country;
    private String city;
    private Character gender;

}
