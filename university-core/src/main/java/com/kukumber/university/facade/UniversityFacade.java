package com.kukumber.university.facade;

import com.kukumber.university.dto.FacultyDto;
import com.kukumber.university.dto.SubjectDto;
import com.kukumber.university.dto.TeacherDto;
import com.kukumber.university.dto.UniversityDto;
import com.kukumber.university.dto.page.PageContentDto;

import java.util.List;

public interface UniversityFacade {

    //--- universities -------------------------------------------------------------------------------------------------

    UniversityDto findOneUniversity(Long id);

    List<UniversityDto> findAllUniversities();

    UniversityDto saveUniversity(UniversityDto universityDto);

    void removeUniversity(Long id);

    //--- faculties ----------------------------------------------------------------------------------------------------

    FacultyDto findOneFaculty(Long id);

    List<FacultyDto> findAllFaculties(Long universityId);

    FacultyDto saveFaculty(FacultyDto facultyDto);

    void removeFaculty(Long id);

    //--- teachers -----------------------------------------------------------------------------------------------------

    TeacherDto findOneTeacher(Long id);

    PageContentDto<TeacherDto> findAllTeachers(Long facultyId, int pageNumber);

    TeacherDto saveTeacher(TeacherDto teacherDto);

    void removeTeacher(Long id);

    //--- subjects -----------------------------------------------------------------------------------------------------

    SubjectDto findOneSubject(Long id);

    List<SubjectDto> findAllSubjects();

    SubjectDto saveSubject(SubjectDto subjectDto);

    void removeSubject(Long id);
}
