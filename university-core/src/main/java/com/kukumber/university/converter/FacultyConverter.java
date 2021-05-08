package com.kukumber.university.converter;

import com.kukumber.university.dto.FacultyDto;
import com.kukumber.university.entity.Faculty;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacultyConverter extends Converter<Faculty, FacultyDto> {

    // FacultyConverter INSTANCE = Mappers.getMapper(FacultyConverter.class);

    Faculty convert(FacultyDto source);

    FacultyDto convert(Faculty source);
}
