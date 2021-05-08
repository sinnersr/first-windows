package com.kukumber.university.service;

import com.kukumber.university.entity.Subject;

import java.util.List;

public interface SubjectService {

    Subject findOne(Long id);

    List<Subject> findAll();

    Subject save(Subject subject);

    void remove(Long id);
}
