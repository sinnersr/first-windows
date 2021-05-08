package com.kukumber.university.converter;

public interface Converter<MODEL, DTO> {

    DTO convert(MODEL source);
}
