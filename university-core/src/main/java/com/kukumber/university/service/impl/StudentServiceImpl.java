package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Student;
import com.kukumber.university.repository.StudentRepository;
import com.kukumber.university.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //---

    @Override
    public Student findOne(Long id) {
        return studentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Page<Student> findAll(Specification<Student> specification, Pageable pageable) {
        return studentRepository.findAll(specification, pageable);
    }

    @Override
    public List<Student> findAllByGroup(Long groupId) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void removeAllByGroup(Long groupId) {

    }
}
