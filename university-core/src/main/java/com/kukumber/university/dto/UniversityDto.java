package com.kukumber.university.dto;

import com.kukumber.university.dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UniversityDto {

    private Long id;

    @NotNull(message = "поле 'name' является обязательным")
    private String name;
}
