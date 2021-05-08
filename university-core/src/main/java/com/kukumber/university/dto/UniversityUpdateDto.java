package com.kukumber.university.dto;

import com.kukumber.university.dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class UniversityUpdateDto extends NameDto {

    @Positive(message = "поле 'id' не может содержать отрицательное значение")
    @Min(value = 1, message = "поле 'id' не может быть равно нулю")
    private Long id;
}
