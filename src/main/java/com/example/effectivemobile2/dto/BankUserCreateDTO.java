package com.example.effectivemobile2.dto;

import com.example.effectivemobile2.entity.Email;
import com.example.effectivemobile2.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@NotBlank
public class BankUserCreateDTO {

    private String login;
    private String password;
//    @PositiveOrZero(message = "Balance should be greater or equals 0")
    private float initialAmount;
//    @NotBlank(message = "Need min 1 number")
    private String phoneNumber;
//    @Email(regexp = ".+[@].+[.com]", message = "Must have '.com' only")
    private String email;
    private LocalDate birthDate;
//    @Size(min = 2, max = 40, message = "Full name cannot be shorter than 2 and longer 40 symbols")
    private String fullName;

}