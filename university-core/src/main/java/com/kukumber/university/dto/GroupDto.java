package com.kukumber.university.dto;

import com.kukumber.university.dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GroupDto {

    private Long id;

    @NotNull
    private Long facultyId;

    @NotNull(message = "поле 'name' является обязательным")
    private String name;
}
