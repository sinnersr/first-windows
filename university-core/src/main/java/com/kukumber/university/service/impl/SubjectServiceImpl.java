package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Subject;
import com.kukumber.university.repository.SubjectRepository;
import com.kukumber.university.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public Subject findOne(Long id) {
        return subjectRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void remove(Long id) {
        subjectRepository.deleteById(id);
    }
}
