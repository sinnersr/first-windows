package com.kukumber.university.service.impl;

import com.kukumber.university.entity.Group;
import com.kukumber.university.repository.GroupRepository;
import com.kukumber.university.service.GroupService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    //---

    @Override
    public Group findOne(Long id) {
        return groupRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Page<Group> findAll(Pageable pageable) {
        return groupRepository.findAll(pageable);
    }

    @Override
    public Group save(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public void remove(Long id) {
        groupRepository.deleteById(id);
    }
}
