package com.kukumber.university.service;

import com.kukumber.university.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface StudentService {

    Student findOne(Long id);

    Page<Student> findAll(Pageable pageable);

    Page<Student> findAll(Specification<Student> specification, Pageable pageable);

    List<Student> findAllByGroup(Long groupId);

    Student save(Student student);

    void remove(Long id);

    void removeAllByGroup(Long groupId);
}
