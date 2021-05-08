package com.kukumber.university.util;

import com.kukumber.university.converter.Converter;
import com.kukumber.university.dto.page.PageContentDto;
import com.kukumber.university.dto.page.PageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.stream.Collectors;

public class PageContentUtils<MODEL, DTO> {

    public PageContentDto<DTO> getPageContent(Page<MODEL> page, Converter<MODEL, DTO> converter, Pageable pageable) {
        return page.getContent().isEmpty() ?
                new PageContentDto<>() :
                new PageContentDto<>(
                        new PageDto(
                                pageable.getPageNumber() + 1,
                                pageable.getPageSize(),
                                pageable.hasPrevious(),
                                page.getTotalElements(),
                                page.getTotalPages(),
                                pageable.getOffset()
                        ),
                        page.getContent().isEmpty() ?
                                Collections.emptyList() :
                                page.getContent().stream().map(converter::convert).collect(Collectors.toList())
                );
    }
}
