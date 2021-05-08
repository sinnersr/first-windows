package com.kukumber.university.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SubjectDto {

    private Long id;

    @NotNull(message = "поле 'name' является обязательным")
    private String name;
}
