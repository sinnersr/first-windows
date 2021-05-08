package com.kukumber.university.dto.parent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PersonDto extends NameDto {

    private String middleName;
    private String lastName;
}
