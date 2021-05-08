package com.kukumber.university.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class EstimateDto {

    private Long id;

    @NotNull
    private Long teacherId;

    @NotNull
    private Long subjectId;

    @NotNull
    private Long studentId;

    @NotNull
    private Integer estimate;
}
