package com.kukumber.university.controller;

import com.kukumber.university.dto.FacultyDto;
import com.kukumber.university.dto.SubjectDto;
import com.kukumber.university.dto.TeacherDto;
import com.kukumber.university.dto.UniversityDto;
import com.kukumber.university.dto.page.PageContentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface UniversityController {

    //--- universities -------------------------------------------------------------------------------------------------

    @GetMapping("/one")
    ResponseEntity<UniversityDto> findOneUniversity(@RequestParam("id") Long id);

    @GetMapping("/all")
    ResponseEntity<List<UniversityDto>> findAllUniversities();

    @PostMapping("/save")
    ResponseEntity<UniversityDto> saveUniversity(@Valid @RequestBody UniversityDto universityDto);

    @DeleteMapping("/remove")
    void removeUniversity(@RequestParam("id") Long id);

    //--- faculties ----------------------------------------------------------------------------------------------------

    @GetMapping("/faculties/one")
    ResponseEntity<FacultyDto> findOneFaculty(@RequestParam("id") Long id);

    @GetMapping("/faculties/all")
    ResponseEntity<List<FacultyDto>> findAllFaculties(@RequestParam("universityId") Long universityId);

    @PostMapping("/faculties/save")
    ResponseEntity<FacultyDto> saveFaculty(@Valid @RequestBody FacultyDto facultyDto);

    @DeleteMapping("/faculties/remove")
    void removeFaculty(@RequestParam("id") Long id);

    //--- teachers -----------------------------------------------------------------------------------------------------

    @GetMapping("/teachers/one")
    ResponseEntity<TeacherDto> findOneTeacher(@RequestParam("id") Long id);

    @GetMapping("/teachers/all")
    ResponseEntity<PageContentDto<TeacherDto>> findAllTeachers(@RequestParam("facultyId") Long facultyId,
                                                               @RequestParam("pageNumber") int pageNumber);

    @PostMapping("/teachers/save")
    ResponseEntity<TeacherDto> saveTeacher(@Valid @RequestBody TeacherDto teacherDto);

    @DeleteMapping("/teachers/remove")
    void removeTeacher(@RequestParam("id") Long id);

    //--- subjects -----------------------------------------------------------------------------------------------------

    @GetMapping("/subjects/one")
    ResponseEntity<SubjectDto> findOneSubject(@RequestParam("id") Long id);

    @GetMapping("/subjects/all")
    ResponseEntity<List<SubjectDto>> findAllSubjects();

    @PostMapping("/subjects/save")
    ResponseEntity<SubjectDto> saveSubject(@Valid @RequestBody SubjectDto subjectDto);

    @DeleteMapping("/subjects/remove")
    void removeSubject(@RequestParam("id") Long id);
}
