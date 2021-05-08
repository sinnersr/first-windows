package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.PersonEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "kuk_teacher")
public class Teacher extends PersonEntity {

    @Basic
    @Column(name = "faculty_id", insertable = false, updatable = false)
    private Long facultyId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "faculty_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_teacher_faculty_id_to_id")
    )
    private Faculty faculty;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "join_teacher_subject",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"),
            foreignKey = @ForeignKey(name = "fk_teacher_to_subject")
    )
    private List<Subject> subjectList;
}
