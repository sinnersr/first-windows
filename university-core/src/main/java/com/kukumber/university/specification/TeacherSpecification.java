package com.kukumber.university.specification;

import com.kukumber.university.entity.Faculty;
import com.kukumber.university.entity.Teacher;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;

public class TeacherSpecification {

    public static Specification<Teacher> findAllByFaculty(Long facultyId) {
        return (Specification<Teacher>) (teacher, criteriaQuery, criteriaBuilder) -> {
            Join<Teacher, Faculty> teacherToFaculty = teacher.join("faculty");
            return criteriaBuilder.equal(teacherToFaculty.get("id"), facultyId);
        };
    }
}
