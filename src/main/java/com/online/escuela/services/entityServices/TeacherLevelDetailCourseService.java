package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.TeacherLevelDetailCourseDTO;

public interface TeacherLevelDetailCourseService {

    List<TeacherLevelDetailCourseDTO> findAll();

    TeacherLevelDetailCourseDTO save(TeacherLevelDetailCourseDTO teacherLevelDetailCourse);

    Optional<TeacherLevelDetailCourseDTO> findById(Long id);

    void deleteById(Long id);

}
