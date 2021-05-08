package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "kuk_university")
public class University extends NameEntity {

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private List<Faculty> facultyList;
}
