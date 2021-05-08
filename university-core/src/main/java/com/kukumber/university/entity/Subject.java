package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "kuk_subject")
public class Subject extends NameEntity {

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "join_teacher_subject",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"),
            foreignKey = @ForeignKey(name = "fk_subject_to_teacher")
    )
    private List<Teacher> teacherList;
}
