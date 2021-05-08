package com.kukumber.university.service;

import com.kukumber.university.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface TeacherService {

    Teacher findOne(Long id);

    Page<Teacher> findAll(Pageable pageable);

    Page<Teacher> findAll(Specification<Teacher> specification, Pageable pageable);

    Teacher save(Teacher teacher);

    void remove(Long id);
}
