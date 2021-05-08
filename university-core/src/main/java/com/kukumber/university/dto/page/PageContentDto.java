package com.kukumber.university.dto.page;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class PageContentDto<E> {

    private PageDto page;
    private List<E> content;

    public PageContentDto() {
        this.page = new PageDto();
        this.content = Collections.emptyList();
    }
}
