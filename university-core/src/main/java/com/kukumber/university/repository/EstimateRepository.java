package com.kukumber.university.repository;

import com.kukumber.university.entity.Estimate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimateRepository extends JpaRepository<Estimate, Long> {

    Page<Estimate> findAll(Specification<Estimate> specification, Pageable pageable);
}
