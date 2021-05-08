package com.kukumber.university.converter;

import com.kukumber.university.dto.UniversityDto;
import com.kukumber.university.entity.University;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UniversityConverter extends Converter<University, UniversityDto> {

    // UniversityConverter INSTANCE = Mappers.getMapper(UniversityConverter.class);

    University convert(UniversityDto source);

    UniversityDto convert(University source);
}
