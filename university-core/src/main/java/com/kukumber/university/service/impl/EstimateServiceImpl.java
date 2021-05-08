package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Estimate;
import com.kukumber.university.repository.EstimateRepository;
import com.kukumber.university.service.EstimateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class EstimateServiceImpl implements EstimateService {

    private final EstimateRepository estimateRepository;

    public EstimateServiceImpl(EstimateRepository estimateRepository) {
        this.estimateRepository = estimateRepository;
    }

    //---

    @Override
    public Estimate findOne(Long id) {
        return estimateRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Page<Estimate> findAll(Specification<Estimate> specification, Pageable pageable) {
        return estimateRepository.findAll(specification, pageable);
    }

    @Override
    public Estimate save(Estimate estimate) {
        return estimateRepository.save(estimate);
    }

    @Override
    public void remove(Long id) {
        estimateRepository.deleteById(id);
    }
}
