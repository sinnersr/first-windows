package com.kukumber.university.controller.impl;

import com.kukumber.university.controller.UniversityController;
import com.kukumber.university.dto.FacultyDto;
import com.kukumber.university.dto.SubjectDto;
import com.kukumber.university.dto.TeacherDto;
import com.kukumber.university.dto.UniversityDto;
import com.kukumber.university.dto.page.PageContentDto;
import com.kukumber.university.facade.UniversityFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/open/universities")
public class UniversityControllerImpl implements UniversityController {

    private final UniversityFacade universityFacade;

    public UniversityControllerImpl(UniversityFacade universityFacade) {
        this.universityFacade = universityFacade;
    }

    //--- universities -------------------------------------------------------------------------------------------------

    @Override
    public ResponseEntity<UniversityDto> findOneUniversity(Long id) {
        return new ResponseEntity<>(universityFacade.findOneUniversity(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UniversityDto>> findAllUniversities() {
        return new ResponseEntity<>(universityFacade.findAllUniversities(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UniversityDto> saveUniversity(UniversityDto universityDto) {
        return new ResponseEntity<>(universityFacade.saveUniversity(universityDto), HttpStatus.OK);
    }

    @Override
    public void removeUniversity(Long id) {
        universityFacade.removeUniversity(id);
    }

    //--- faculties ----------------------------------------------------------------------------------------------------

    @Override
    public ResponseEntity<FacultyDto> findOneFaculty(Long id) {
        return new ResponseEntity<>(universityFacade.findOneFaculty(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<FacultyDto>> findAllFaculties(Long universityId) {
        return new ResponseEntity<>(universityFacade.findAllFaculties(universityId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<FacultyDto> saveFaculty(FacultyDto facultyDto) {
        return new ResponseEntity<>(universityFacade.saveFaculty(facultyDto), HttpStatus.OK);
    }

    @Override
    public void removeFaculty(Long id) {
        universityFacade.removeFaculty(id);
    }

    //--- teachers -----------------------------------------------------------------------------------------------------

    @Override
    public ResponseEntity<TeacherDto> findOneTeacher(Long id) {
        return new ResponseEntity<>(universityFacade.findOneTeacher(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PageContentDto<TeacherDto>> findAllTeachers(Long facultyId, int pageNumber) {
        return new ResponseEntity<>(universityFacade.findAllTeachers(facultyId, pageNumber), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TeacherDto> saveTeacher(TeacherDto teacherDto) {
        return new ResponseEntity<>(universityFacade.saveTeacher(teacherDto), HttpStatus.OK);
    }

    @Override
    public void removeTeacher(Long id) {
        universityFacade.removeTeacher(id);
    }

    //--- subjects -----------------------------------------------------------------------------------------------------

    @Override
    public ResponseEntity<SubjectDto> findOneSubject(Long id) {
        return new ResponseEntity<>(universityFacade.findOneSubject(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<SubjectDto>> findAllSubjects() {
        return new ResponseEntity<>(universityFacade.findAllSubjects(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SubjectDto> saveSubject(SubjectDto subjectDto) {
        return new ResponseEntity<>(universityFacade.saveSubject(subjectDto), HttpStatus.OK);
    }

    @Override
    public void removeSubject(Long id) {
        universityFacade.removeSubject(id);
    }
}
