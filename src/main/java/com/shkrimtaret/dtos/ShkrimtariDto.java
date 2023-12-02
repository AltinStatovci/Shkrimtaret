package com.shkrimtaret.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShkrimtariDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthdate;
    private Boolean active;
    private String writingStyle;
    private int average;

}
