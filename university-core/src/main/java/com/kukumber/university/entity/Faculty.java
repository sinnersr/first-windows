package com.kukumber.university.entity;

import com.kukumber.university.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "kuk_faculty")
public class Faculty extends NameEntity {

    @Basic
    @Column(name = "university_id", insertable = false, updatable = false)
    private Long universityId;

    // не обязательно
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "university_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_university_id_to_id")
    )
    private University university;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private List<Teacher> teacherList;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private List<Group> groupList;
}
