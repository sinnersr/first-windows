package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "kuk_estimate")
public class Estimate extends BaseEntity {

    @Basic
    @Column(name = "teacher_id", insertable = false, updatable = false)
    private Long teacherId;

    @Basic
    @Column(name = "subject_id", insertable = false, updatable = false)
    private Long subjectId;

    @Basic
    @Column(name = "student_id", insertable = false, updatable = false)
    private Long studentId;

    @Basic
    @Column(name = "estimate", length = 2)
    private Integer estimate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_estimate_teacher_id_to_id")
    )
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "subject_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_estimate_subject_id_to_id")
    )
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_estimate_student_id_to_id")
    )
    private Student student;
}
