package com.kukumber.university.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class StudentDto {

    private String id;

    @NotNull
    private Long groupId;

    @NotNull(message = "поле 'name' является обязательным")
    private String name;

    private String middleName;
    private String lastName;
}
