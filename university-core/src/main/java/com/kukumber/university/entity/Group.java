package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "kuk_group")
public class Group extends NameEntity {

    @Basic
    @Column(name = "faculty_id", insertable = false, updatable = false)
    private Long facultyId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "faculty_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_group_faculty_id_to_id")
    )
    private Faculty faculty;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Student> studentList;
}
