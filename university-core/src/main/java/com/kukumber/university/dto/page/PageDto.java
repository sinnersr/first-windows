package com.kukumber.university.dto.page;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageDto {

    private Integer pageNumber;
    private Integer pageSize;
    private Boolean hasPrevious;
    private Long totalElements;
    private Integer totalPages;
    private Long offset;
}
