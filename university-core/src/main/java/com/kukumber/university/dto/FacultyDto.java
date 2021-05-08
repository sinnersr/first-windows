package com.kukumber.university.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class FacultyDto {

    private Long id;

    @NotNull
    private Long universityId;

    @NotNull(message = "поле 'name' является обязательным")
    private String name;
}
