package com.kukumber.university.service;

import com.kukumber.university.entity.Estimate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface EstimateService {

    Estimate findOne(Long id);

    Page<Estimate> findAll(Specification<Estimate> specification, Pageable pageable);

    Estimate save(Estimate estimate);

    void remove(Long id);
}
