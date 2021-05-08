package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.PersonEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "kuk_student")
public class Student extends PersonEntity {

    @Basic
    @Column(name = "group_id", insertable = false, updatable = false)
    private Long groupId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "group_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_student_to_group")
    )
    private Group group;
}
