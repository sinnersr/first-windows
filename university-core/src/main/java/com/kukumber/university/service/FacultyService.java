package com.kukumber.university.service;

import com.kukumber.university.entity.Faculty;

import java.util.List;

public interface FacultyService {

    Faculty findOne(Long id);

    List<Faculty> findAll(Long universityId);

    Faculty save(Faculty faculty);

    void remove(Long id);
}
