package com.kukumber.university.facade.impl;

import com.kukumber.university.converter.FacultyConverter;
import com.kukumber.university.converter.SubjectConverter;
import com.kukumber.university.converter.TeacherConverter;
import com.kukumber.university.converter.UniversityConverter;
import com.kukumber.university.dto.FacultyDto;
import com.kukumber.university.dto.SubjectDto;
import com.kukumber.university.dto.TeacherDto;
import com.kukumber.university.dto.UniversityDto;
import com.kukumber.university.dto.page.PageContentDto;
import com.kukumber.university.entity.Faculty;
import com.kukumber.university.entity.Subject;
import com.kukumber.university.entity.Teacher;
import com.kukumber.university.entity.University;
import com.kukumber.university.facade.UniversityFacade;
import com.kukumber.university.service.FacultyService;
import com.kukumber.university.service.SubjectService;
import com.kukumber.university.service.TeacherService;
import com.kukumber.university.service.UniversityService;
import com.kukumber.university.specification.TeacherSpecification;
import com.kukumber.university.util.PageContentUtils;
import com.kukumber.university.util.PaginationUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UniversityFacadeImpl implements UniversityFacade {

    private final UniversityService universityService;
    private final FacultyService facultyService;
    private final TeacherService teacherService;
    private final SubjectService subjectService;
    private final UniversityConverter universityConverter;
    private final FacultyConverter facultyConverter;
    private final TeacherConverter teacherConverter;
    private final SubjectConverter subjectConverter;

    public UniversityFacadeImpl(UniversityService universityService,
                                FacultyService facultyService,
                                TeacherService teacherService,
                                SubjectService subjectService,
                                UniversityConverter universityConverter,
                                FacultyConverter facultyConverter,
                                TeacherConverter teacherConverter,
                                SubjectConverter subjectConverter) {
        this.universityService = universityService;
        this.facultyService = facultyService;
        this.teacherService = teacherService;
        this.subjectService = subjectService;
        this.universityConverter = universityConverter;
        this.facultyConverter = facultyConverter;
        this.teacherConverter = teacherConverter;
        this.subjectConverter = subjectConverter;
    }

    //--- universities -------------------------------------------------------------------------------------------------

    @Override
    public UniversityDto findOneUniversity(Long id) {
        return universityConverter.convert(
                universityService.findOne(id)
        );
    }

    @Override
    public List<UniversityDto> findAllUniversities() {
        List<University> universityList = universityService.findAll();
        return universityList.isEmpty() ?
                Collections.emptyList() :
                universityList.stream().map(universityConverter::convert).collect(Collectors.toList());
    }

    @Override
    public UniversityDto saveUniversity(UniversityDto universityDto) {
        return universityConverter.convert(
                universityService.save(
                        universityConverter.convert(universityDto)
                )
        );
    }

    @Override
    public void removeUniversity(Long id) {
        universityService.remove(id);
    }

    //--- faculties ----------------------------------------------------------------------------------------------------

    @Override
    public FacultyDto findOneFaculty(Long id) {
        return facultyConverter.convert(
                facultyService.findOne(id)
        );
    }

    @Override
    public List<FacultyDto> findAllFaculties(Long universityId) {
        List<Faculty> facultyList = facultyService.findAll(universityId);
        return facultyList.isEmpty() ?
                Collections.emptyList() :
                facultyList.stream().map(facultyConverter::convert).collect(Collectors.toList());
    }

    @Override
    public FacultyDto saveFaculty(FacultyDto facultyDto) {
        return facultyConverter.convert(
                facultyService.save(
                        facultyConverter.convert(facultyDto)
                )
        );
    }

    @Override
    public void removeFaculty(Long id) {
        facultyService.remove(id);
    }

    //--- teachers -----------------------------------------------------------------------------------------------------

    @Override
    public TeacherDto findOneTeacher(Long id) {
        return teacherConverter.convert(
                teacherService.findOne(id)
        );
    }

    @Override
    public PageContentDto<TeacherDto> findAllTeachers(Long facultyId, int pageNumber) {
        Pageable pageable = PaginationUtils.getPageable(pageNumber);
        Page<Teacher> teacherPage = teacherService.findAll(
                TeacherSpecification.findAllByFaculty(facultyId),
                pageable
        );
        return new PageContentUtils<Teacher, TeacherDto>()
                .getPageContent(
                        teacherPage,
                        teacherConverter,
                        pageable
                );
    }

    @Override
    public TeacherDto saveTeacher(TeacherDto teacherDto) {
        return teacherConverter.convert(
                teacherService.save(
                        teacherConverter.convert(teacherDto)
                )
        );
    }

    @Override
    public void removeTeacher(Long id) {
        teacherService.remove(id);
    }

    //--- subjects -----------------------------------------------------------------------------------------------------

    @Override
    public SubjectDto findOneSubject(Long id) {
        return subjectConverter.convert(
                subjectService.findOne(id)
        );
    }

    @Override
    public List<SubjectDto> findAllSubjects() {
        List<Subject> subjectList = subjectService.findAll();
        return subjectList.isEmpty() ?
                Collections.emptyList() :
                subjectList.stream().map(subjectConverter::convert).collect(Collectors.toList());
    }

    @Override
    public SubjectDto saveSubject(SubjectDto subjectDto) {
        return subjectConverter.convert(
                subjectService.save(
                        subjectConverter.convert(subjectDto)
                )
        );
    }

    @Override
    public void removeSubject(Long id) {
        subjectService.remove(id);
    }
}
