package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Teacher;
import com.kukumber.university.repository.TeacherRepository;
import com.kukumber.university.service.TeacherService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public Teacher findOne(Long id) {
        return teacherRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Page<Teacher> findAll(Pageable pageable) {
        return teacherRepository.findAll(pageable);
    }

    @Override
    public Page<Teacher> findAll(Specification<Teacher> specification, Pageable pageable) {
        return teacherRepository.findAll(specification, pageable);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void remove(Long id) {
        teacherRepository.deleteById(id);
    }
}
