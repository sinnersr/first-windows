package com.kukumber.university.dto.parent;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public abstract class NameDto {

    @NotNull(message = "поле 'name' является обязательным")
    private String name;
}
