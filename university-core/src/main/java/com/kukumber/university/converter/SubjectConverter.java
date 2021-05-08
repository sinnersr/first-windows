package com.kukumber.university.converter;

import com.kukumber.university.dto.SubjectDto;
import com.kukumber.university.entity.Subject;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectConverter extends Converter<Subject, SubjectDto> {

    // SubjectConverter INSTANCE = Mappers.getMapper(SubjectConverter.class);

    Subject convert(SubjectDto source);

    SubjectDto convert(Subject source);
}
