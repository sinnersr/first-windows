package com.kukumber.university.entity.parent;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class PersonEntity extends NameEntity {

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "middle_name")
    private String middleName;
}
