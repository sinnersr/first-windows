package com.kukumber.university.service.impl;

import com.kukumber.university.entity.University;
import com.kukumber.university.repository.UniversityRepository;
import com.kukumber.university.service.UniversityService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    //---

    @Override
    public University findOne(Long id) {
        return universityRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void remove(Long id) {
        universityRepository.deleteById(id);
    }
}
