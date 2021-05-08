package com.kukumber.university.service;

import com.kukumber.university.entity.Group;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GroupService {

    Group findOne(Long id);

    Page<Group> findAll(Pageable pageable);

    Group save(Group group);

    void remove(Long id);
}
