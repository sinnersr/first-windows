package com.kukumber.university.service;

import com.kukumber.university.entity.University;

import java.util.List;

public interface UniversityService {

    University findOne(Long id);

    List<University> findAll();

    University save(University university);

    void remove(Long id);
}
