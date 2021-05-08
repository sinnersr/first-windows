package com.kukumber.university.converter;

import com.kukumber.university.dto.TeacherDto;
import com.kukumber.university.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherConverter extends Converter<Teacher, TeacherDto> {

    // TeacherConverter INSTANCE = Mappers.getMapper(TeacherConverter.class);

    Teacher convert(TeacherDto source);

    TeacherDto convert(Teacher source);
}
