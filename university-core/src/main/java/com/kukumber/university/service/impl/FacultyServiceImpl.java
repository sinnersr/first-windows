package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Faculty;
import com.kukumber.university.repository.FacultyRepository;
import com.kukumber.university.service.FacultyService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    //---

    @Override
    public Faculty findOne(Long id) {
        return facultyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Faculty> findAll(Long universityId) {
        return facultyRepository.findAllByUniversityId(universityId);
    }

    @Override
    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public void remove(Long id) {
        facultyRepository.deleteById(id);
    }
}
